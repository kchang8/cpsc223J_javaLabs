//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 5
//Virtual pet: creates a virtual pet class that identifies 
//its attributes and displays a menu with actions

import java.util.Scanner;
public class lab5 {

	public static void main(String[] args) {
		//reads in the pet name
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name for your pet cat: ");
		virtualPet pTemp = new virtualPet(input.nextLine());
		System.out.println("Initializing Stats...");
		printStats(pTemp);
		System.out.println(pTemp.getName() + " was born!\n");

		//choice menu
		int choiceNum;
		do{
			printMenu();
			System.out.println("Enter a number(1-5):");
			choiceNum = input.nextInt();
			
			switch(choiceNum)
			{
				case 1:
					pTemp.feed();
					checkAttributes(pTemp);
					System.out.println("\n");
					Attribute_Tool.statZero(pTemp);
					printStats(pTemp);
					break;
				case 2:
					pTemp.wash();
					checkAttributes(pTemp);
					System.out.println("\n");
					Attribute_Tool.statZero(pTemp);
					printStats(pTemp);
					break;
				case 3:
					pTemp.play();
					checkAttributes(pTemp);
					System.out.println("\n");
					Attribute_Tool.statZero(pTemp);
					printStats(pTemp);
					break;
				case 4:
					pTemp.health();
					checkAttributes(pTemp);
					System.out.println("\n");
					Attribute_Tool.statZero(pTemp);
					printStats(pTemp);
					break;
				case 5:
					break;	
			}
		}while(Attribute_Tool.statZero(pTemp) == true && pTemp.readAge() != 9 && choiceNum != 5);
		
		//if age is 9
		if(pTemp.readAge() == 9)
		{
			pTemp.quit();
		}
		
		//checks false
		if(Attribute_Tool.statZero(pTemp) == false)
		{
			System.out.println("\nInsufficient stat: " + pTemp.getName() + " has died\n"
					+ "Quitting Program...");
		}
	}
	
	public static void printStats(virtualPet temp)
	{
		System.out.println("-" + temp.getName() + "'s Stats-\n" +
				"Hunger: " + temp.getHunger() +
				"\nCleanliness: " + temp.getCleanliness() +
				"\nHappiness: " + temp.getHappiness() +
				"\nHealth: " + temp.getHealth() + "\n");
	}
	
	public static void printMenu()
	{
		System.out.println("Main Menu:\n" + "1. Feed\n" + "2. Wash\n" +
				"3. Play\n" + "4. Health\n" + "5. -Quit-");
	}
	
	public static void checkAttributes(virtualPet temp)
	{
		Attribute_Tool.checkCleanliness(temp);
		Attribute_Tool.checkHappiness(temp);
		Attribute_Tool.checkHealth(temp);
		Attribute_Tool.checkHunger(temp);
	}
}
