
public class virtualPet {
	private String petName;
	private int petHunger;
	private int petCleanliness;
	private int petHappiness;
	private int petHealth;
	private int petAge;
	
	//constructor
	public virtualPet(String name)
	{
		this.petName = name;
		petHunger = (int)(Math.random()*10) + 1;
		petCleanliness = (int)(Math.random()*10) + 1;
		petHappiness = (int)(Math.random()*10) + 1;
		petHealth = (int)(Math.random()*10) + 1;
		petAge = 0;
	}
	
	//DISPLAY STATS GETTERS AND SETTERS
	public String getName()
	{
		return petName;
	}
	//Hunger
	public void setHunger(int hunger)
	{
		petHunger = hunger;
	}
	public int getHunger()
	{
		return petHunger;
	}
	//Cleanliness
	public void setCleanliness(int cleanliness)
	{
		petCleanliness = cleanliness;
	}
	public int getCleanliness()
	{
		return petCleanliness;
	}
	//Happiness
	public void setHappiness(int happiness)
	{
		petHappiness = happiness;
	}
	public int getHappiness()
	{
		return petHappiness;
	}
	//Health
	public void setHealth(int health)
	{
		petHealth = health;
	}
	public int getHealth()
	{
		return petHealth;
	}
	//Age
	public int readAge()
	{
		return petAge;
	}
	
	//randomized menu choices
	public void feed()
	{
		int statements = (int)(Math.random()*2) + 1;
		
		if (statements == 1)
		{
			System.out.println(petName + " meows with joy as you offer a fish-shaped treat."
					+ "(+1 Hunger)");
			petHunger++;
			petAge++;
		}
		else if (statements == 2)
		{
			System.out.println(petName + " ate the canned tuna.(+1 Hunger)");
			petHunger++;
			petAge++;
		}
	}
	public void wash()
	{
		int statements = (int)(Math.random()*2) + 1;
		
		if (statements == 1)
		{
			System.out.println(petName + " refuses to get in the tub, but eventually she became clean."
					+ "(+1 Cleanliness)");
			petCleanliness++;
			petAge++;
		}
		else if (statements == 2)
		{
			System.out.println(petName + "'s fur became poofy after you dried it with a towel."
					+ "(+1 Cleanliness)");
			petCleanliness++;
			petAge++;
		}
	}
	public void play()
	{
		int statements = (int)(Math.random()*2) + 1;
		
		if (statements == 1)
		{
			System.out.println("You pet " + petName + " and she starts purring."
					+ "(+1 Happiness)");
			petHappiness++;
			petAge++;
		}
		else if (statements == 2)
		{
			System.out.println(petName + " becomes excited while playing with the toy mouse."
					+ "(+1 Happiness)");
			petHappiness++;
			petAge++;
		}
	}
	public void health()
	{
		int statements = (int)(Math.random()*2) + 1;
		
		if (statements == 1)
		{
			System.out.println(petName + " is lazy and decides to take a nap."
					+ "(+1 Health)");
			petHealth++;
			petAge++;
		}
		else if (statements == 2)
		{
			System.out.println(petName + " walks around the house and jumps onto high places."
					+ "(+1 Health)");
			petHealth++;
			petAge++;
		}
	}
	
	public void quit()
	{
		System.out.println("\n" + petName + " died of old age\nQuitting Program...");
	}
	
}
