
public class Baseball_Player {
	private int id;
	private double avg;
	private static int counter = 0;
	
	//constructor for catcher and shortstop
	public Baseball_Player(int idNum, double average)
	{
		id = idNum;
		avg = average;
		counter = counter+1;
	}
	
	//constructor for batter
	public Baseball_Player(int idNum)
	{
		id = idNum;
		avg = 0.5;
		counter = counter + 1;
	}
	public double getAvg()
	{
		return avg;
	}
	
	//constructor for outfielder
	public Baseball_Player(double average)
	{
		id = 999;
		avg = average;
		counter = counter + 1;
	}
	public int getId()
	{
		return id;
	}
	
	//shows the counter
	public int showCount()
	{
		return counter;
	}
}
