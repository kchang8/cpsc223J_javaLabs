//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 4 Classes
//Car Class: create a class that represents a car
//identify by object name, speed, and distance

public class lab4 {

	public static void main(String[] args) {
		Car Lola = new Car();
		
		Lola.setCarSpeed(0);
		Lola.setCarDistance(0);
		print(Lola);
		
		Lola.accelerate(50);
		Lola.travel(1.5);
		print(Lola);
		
		Lola.decelerate(15);
		Lola.travel(1);
		
		print(Lola);
	}

	//demo
	public static void print(Car car1)
	{
		System.out.println("Lola has a current speed of " + car1.getCarSpeed()
		+ " and has gone a distance of " + car1.getCarDistance());
	}
	
	public static void print(int speed, int distance)
	{
		System.out.println("Lola's speed is " + speed
		+ " and her distance traveled is " + distance);
	}
}
