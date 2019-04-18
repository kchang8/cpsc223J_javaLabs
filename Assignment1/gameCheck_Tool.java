import java.util.Scanner;

public class gameCheck_Tool {
	public static int row; //variable for rows in the array
	public static int col; //variable for columns in the array
	public static Scanner input = new Scanner(System.in);
	public static char player = 'X'; //initializes the player char to 'X'
	//counter counts the limited number of times the players played
	public static int counter = 0; 
	
	//gets the user input for the rows and columns
	public static void userInput()
	{
		//gets the rows
		System.out.println("Which Row would you like?");
		row = input.nextInt();
		//gets the cols
		System.out.println("Which Col would you like?");
		col = input.nextInt();
		//make the respective row and col inputs to equal to X or O
		//if the box is not empty
		if(Game_Board.table[row][col] != ' ')
		{
			System.out.println("Illegal move");
			userInput();
		}
		else //if it is empty
		{
			Game_Board.table[row][col] = player;
			counter++;
		}
	}
	
	//initiates the game play and checks each player char and their inputs
	public static void play()
	{
		//runPlay allows the game to loop while it is true
		boolean runPlay = true;
		do
		{
			//if there are no matches
			if(checkGame(row, col) == false)
			{
				//checks player characters to switch players
				if(player == 'X')
				{
					player = 'O';
					System.out.println("Player 2 turn 'O'");
					Game_Board.printBoard();
					userInput();
				}
				else //if player = 'O'
				{
					player = 'X';
					System.out.println("Player 1 turn 'X'");
					Game_Board.printBoard();
					userInput();
				}
				
				//if the player gets to the last turn, which is 9,
				//and there are no matches
				if(counter == 9)
				{
					runPlay = false; //stops loop
					System.out.println("Cat's Game!");
					Game_Board.printBoard();
				}
			}
			//if there are matches of one of the characters
			else if(checkGame(row, col) == true)
			{
				runPlay = false; //stops the loop
				System.out.println(player + " Player Wins!");
				Game_Board.printBoard();
			}	
		}while(runPlay == true);
	}
	
	//checks for the vertical, horizontal, and diagonal matches for each input
	public static boolean checkGame(int r, int c)
	{
		//vertical
		if(Game_Board.table[0][c] == Game_Board.table[1][c] && Game_Board.table[0][c] == Game_Board.table[2][c])
		{
			return true;
		}
		//horizontal
		if(Game_Board.table[r][0] == Game_Board.table[r][1] && Game_Board.table[r][0] == Game_Board.table[r][2])
		{
			return true;
		}
		//checks for diagonal matches starting with the middle index
		if(Game_Board.table[1][1] == 'X' || Game_Board.table[1][1] == 'O')
		{
			if(Game_Board.table[0][0] == Game_Board.table[1][1] && Game_Board.table[0][0] == Game_Board.table[2][2])
			{
				return true;
			}
			if(Game_Board.table[0][2] == Game_Board.table[1][1] && Game_Board.table[0][2] == Game_Board.table[2][0])
			{
				return true;
			}
		}
		//no matches
		return false;
	}
}
