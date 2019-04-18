//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 6
//Overloading constructors: write a program that uses the 
//JOptionPane class to receive user input to collect info about player

import javax.swing.JOptionPane;

public class lab6 {

	public static void main(String[] args) {
		String idCatcher, idShortstop, idBatter;
		int idNum;
		String avgCatcher, avgShortstop, avgOutfielder;
		double avgNum;
		
		//catcher
		idCatcher = JOptionPane.showInputDialog(null, "What is the Catcher's id?",
				"Catcher", JOptionPane.QUESTION_MESSAGE);
		idNum = Integer.parseInt(idCatcher);
		avgCatcher = JOptionPane.showInputDialog(null, "What is the Catcher's Batting Average?",
				"Catcher", JOptionPane.QUESTION_MESSAGE);
		avgNum = Double.parseDouble(avgCatcher);
		Baseball_Player Catcher = new Baseball_Player(idNum, avgNum);
		
		JOptionPane.showMessageDialog(null, "Player #" + idNum + " batting average is " +
				avgNum + ". There are " + Catcher.showCount() + " players total on the team",
				"Display Player", JOptionPane.INFORMATION_MESSAGE);
		
		//shortstop
		idShortstop = JOptionPane.showInputDialog(null, "What is the Shortstop's id?",
				"Shortstop", JOptionPane.QUESTION_MESSAGE);
		idNum = Integer.parseInt(idShortstop);
		avgShortstop = JOptionPane.showInputDialog(null, "What is the Shortstop's Batting Average?",
				"Shortstop", JOptionPane.QUESTION_MESSAGE);
		avgNum = Double.parseDouble(avgShortstop);
		Baseball_Player Shortstop = new Baseball_Player(idNum, avgNum);
		
		JOptionPane.showMessageDialog(null, "Player #" + idNum + " batting average is " +
				avgNum + ". There are " + Catcher.showCount() + " players total on the team",
				"Display Player", JOptionPane.INFORMATION_MESSAGE);
		
		//outfielder
		avgOutfielder = JOptionPane.showInputDialog(null, "What is the Outfielder's Batting Average?",
				"Outfielder", JOptionPane.QUESTION_MESSAGE);
		avgNum = Double.parseDouble(avgOutfielder);
		Baseball_Player Outfielder = new Baseball_Player(avgNum);
		
		JOptionPane.showMessageDialog(null, "Player #" + Outfielder.getId() + " batting average is " +
				avgNum + ". There are " + Catcher.showCount() + " players total on the team",
				"Display Player", JOptionPane.INFORMATION_MESSAGE);
		
		//Batter
		idBatter = JOptionPane.showInputDialog(null, "What is the Batter's id?",
				"Batter", JOptionPane.QUESTION_MESSAGE);
		idNum = Integer.parseInt(idBatter);
		Baseball_Player Batter = new Baseball_Player(idNum);
		
		JOptionPane.showMessageDialog(null, "Player #" + idNum + " batting average is " +
				Batter.getAvg() + ". There are " + Catcher.showCount() + " players total on the team",
				"Display Player", JOptionPane.INFORMATION_MESSAGE);

		//show total average
		JOptionPane.showMessageDialog(null, "There are " + Catcher.showCount() + " players & the teams"
				+ " collective batting average is: " +
				(Catcher.getAvg() + Shortstop.getAvg() + Outfielder.getAvg() + Batter.getAvg())/Catcher.showCount(),
				"Collective Batting Average", JOptionPane.INFORMATION_MESSAGE);
	}

}
