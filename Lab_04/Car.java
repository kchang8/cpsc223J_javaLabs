public class Car {
	private int carSpeed;
	private int carDistance;
	
	//sets and gets car speed
	public void setCarSpeed(int speed)
	{
		carSpeed = speed;
	}
	public int getCarSpeed()
	{
		return carSpeed;
	}
	
	//sets and gets car distance
	public void setCarDistance(int distance)
	{
		carDistance = distance;
	}
	public int getCarDistance()
	{
		return carDistance;
	}
	
	//accelerate method
	public void accelerate(int accel)
	{
		if(carSpeed >= 0)
		{
			carSpeed += accel;
		}
	}
	
	//decelerate method
	public void decelerate(int decel)
	{
		if(carSpeed > 0)
		{
			carSpeed -= decel;
		}
	}
	
	//travel method
	public void travel(double hours)
	{
		carDistance += (int)(carSpeed * hours);
	}
}
