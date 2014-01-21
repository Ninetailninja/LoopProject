package loop.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import loop.controller.LoopController;

public class LoopFrame extends JFrame
{
	private LoopPanel basePanel;
	private LoopController baseController;
	
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new LoopPanel(baseController);
		
		setupFrame();
		
	}
	
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setVisible(true);
	}
}
