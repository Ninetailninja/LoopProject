package loop.controller;

import loop.model.Looper;
import loop.view.LoopFrame;

public class LoopController
{

	private LoopFrame looperFrame;
	private Looper theLooper;

	public LoopController()
	{
		theLooper = new Looper();

	}

	public void start()
	{

		looperFrame = new LoopFrame(this);
	}

	public String getLoopResults()
	{
		String results = "";

		results = theLooper.loopResults2();

		return results;
	}

	public String getListResults(int position)
	{
		String currentResult = "";

		if (position < theLooper.getGraveName().size())
		{
			currentResult = theLooper.getGraveName().get(position);
		}

		return currentResult;
	}
	
	private String loopBackwardOverList()
	{
		String results = "";
		
		for(int position = theLooper.getGraveName().size()-1; position > 0 ; position--)
		{
			results += theLooper.getGraveName().get(position) + "\n";
		}
		return results;
	}
	
	private String loopOverList()
	{
		String results = "";
		
		for (int position = 0; position < theLooper.getGraveName().size(); position++)
		{
			results += theLooper.getGraveName().get(position) + "\n";
		}
		
		
		return results;
	}
}
