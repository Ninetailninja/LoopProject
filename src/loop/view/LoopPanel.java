package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import loop.controller.LoopController;

public class LoopPanel extends JPanel
{

	private JButton submitButton;
	private JScrollPane scrollBar;
	private JTextArea loopArea;
	private SpringLayout baseLayout;
	
	private LoopController baseController;
	
	
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		submitButton = new JButton("Hey Baby ;)");
		baseLayout = new SpringLayout();
		loopArea = new JTextArea(10, 20);
		scrollBar = new JScrollPane(loopArea);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(scrollBar);
		
		loopArea.setEditable(false);
		loopArea.setLineWrap(true);
		loopArea.setWrapStyleWord(true);
		
	}
	
	
	private void setupLayout()
	{
		scrollBar.setSize(10, 15);

		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 166, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -41, SpringLayout.SOUTH, this);
	}
	
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			int list = 0;
			public void actionPerformed(ActionEvent click)
			{
				loopArea.append(baseController.getListResults(list) + " ");
				list++;
			}
		});
	}
	
}
