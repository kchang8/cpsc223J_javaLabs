
public class Attribute_Tool {
	public static void checkCleanliness(virtualPet Cat)
	{
		if(Cat.getCleanliness() < 5)
		{
			int statements = (int)(Math.random()*2) + 1;
			
			if(statements == 1)
			{
				System.out.println(Cat.getName() + " is starting to smell bad."
						+ "(-1 Health)");
				Cat.setHealth(Cat.getHealth() - 1);
			}
			else if(statements == 2)
			{
				System.out.println(Cat.getName() + " runs away from you to avoid taking a bath."
						+ "(-1 Happiness)");
				Cat.setHappiness(Cat.getHappiness() - 1);
			}
		}
	}
	
	public static void checkHappiness(virtualPet Cat)
	{
		if(Cat.getHappiness() < 5)
		{
			int statements = (int)(Math.random()*2) + 1;
			
			if(statements == 1)
			{
				System.out.println(Cat.getName() + " wants your attention."
						+ "(-1 Hunger)");
				Cat.setHunger(Cat.getHunger() - 1);
			}
			else if(statements == 2)
			{
				System.out.println(Cat.getName() + " wants a new toy."
						+ "(-1 Health)");
				Cat.setHealth(Cat.getHealth() - 1);
			}
		}
	}
	
	public static void checkHealth(virtualPet Cat)
	{
		if(Cat.getHealth() < 5)
		{
			int statements = (int)(Math.random()*2) + 1;
			
			if(statements == 1)
			{
				System.out.println(Cat.getName() + " is starting to vomit."
						+ "(-1 Cleanliness)");
				Cat.setCleanliness(Cat.getCleanliness() - 1);
			}
			else if(statements == 2)
			{
				System.out.println(Cat.getName() + " is not eating a lot."
						+ "(-1 Happiness)");
				Cat.setHappiness(Cat.getHappiness() - 1);
			}
		}
	}
	
	public static void checkHunger(virtualPet Cat)
	{
		if(Cat.getHunger() < 5)
		{
			int statements = (int)(Math.random()*2) + 1;
			
			if(statements == 1)
			{
				System.out.println(Cat.getName() + " is looking kind of thin."
						+ "(-1 Health)");
				Cat.setHealth(Cat.getHealth() - 1);
			}
			else if(statements == 2)
			{
				System.out.println(Cat.getName() + " goes to you for food."
						+ "(-1 Happiness)");
				Cat.setHappiness(Cat.getHappiness() - 1);
			}
		}
	}
	
	public static boolean statZero(virtualPet Cat)
	{
		if(Cat.getCleanliness() <= 0)
		{
			return false;
		}
		else if(Cat.getHappiness() <= 0)
		{
			return false;
		}
		else if(Cat.getHealth() <= 0)
		{
			return false;
		}
		else if(Cat.getHunger() <= 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
