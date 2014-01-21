package loop.model;
import java.util.ArrayList;

public class Looper
{

	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		fillGraveNames();
		
	}
	
	public ArrayList<String> getGraveName()
	{
		return graveNameList;
	}
	
	private void fillGraveNames()
	{
		graveNameList.add("George Wesley");
		graveNameList.add("Frances Davenport");
		graveNameList.add("Arthur Julius");
		graveNameList.add("Delilah M. Sisam");
		graveNameList.add("G. Leonard");
		graveNameList.add("M. Secilia");
		graveNameList.add("Harry W. Black");
		graveNameList.add("April Anderson");
		graveNameList.add("Ruth Carlsonnix");
		graveNameList.add("Marian Maxwell Holdaway");
	}
	
	public String loopResults1()
	{
		String loopResult = "";
		int numberOfTimes = 0;

		for (int counter = 0; counter < 20; counter++)
		{
			loopResult += counter + ", ";
			numberOfTimes++;
		}
		loopResult += "was the last time";
		loopResult += "\n The loop executed " + numberOfTimes + " times.";

		return loopResult;
	}

	public String loopResults2()
	{
		String loopResult = "";
		int numberOfTimes = 0;

		for (int week = 0; week < 52; week++)
		{
			for (int day = 0; day < 7; day++)
			{

				for (int days = 0; days < 24; days++)
				{
					for (int hours = 0; hours < 60; hours++)
					{
						for (int minutes = 0; minutes < 60; minutes++)
						{
							numberOfTimes++;
						}
						
					}

				}
			}
		}
		loopResult += "The loop executed " + numberOfTimes + " times - wow!";

		return loopResult;
	}
}
