
public class Game_Board {
	//creates empty 2D array or the tic tac toe board
	public static char[][] table = new char[3][3];
	
	//initializes the array to have blank chars 
	public static void setBoard()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				table[i][j] = ' ';
			}
		}
	}

	//prints out the board with the blank chars and will
	//replace them with X and O as it runs
	public static void printBoard()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(j == 2) //if the array reaches the third column
				{
					//only prints out the blank char
					System.out.println(table[i][j]);
				}
				else //if it is not at the third column
				{
					//prints out the blank char and a divider
					System.out.print(table[i][j] + "|");
				}
			}
			if(i != 2) //if the rows are not the third row
			{
				System.out.println("-----");
			}
		}
	}
}
