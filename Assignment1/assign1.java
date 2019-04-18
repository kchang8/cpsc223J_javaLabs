//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Assignment 1
//creates a tic tac toe game program

public class assign1 {
	public static void main(String[] args) {
		Game_Board myBoard = new Game_Board();
		//start of game
		System.out.println("Welcome to Tic-Tac-Toe");
		System.out.println("=======================");
		System.out.println("Player 1 turn 'X'");

		myBoard.setBoard();
		myBoard.printBoard();
		gameCheck();
	}
	
	//function that utilizes the gameCheck_tool class
	public static void gameCheck()
	{
		gameCheck_Tool.userInput();
		gameCheck_Tool.play();
	}
}
