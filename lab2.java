//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 2
//practicing with input/output with JOptionPane

import javax.swing.JOptionPane;
public class lab2 {

	public static void main(String[] args) {
		//taxable income
		//creates a program utilizing JOptionPane that computes a single filer's
		//federal income tax
		String taxString;
		double taxIncome;
		
		taxString = JOptionPane.showInputDialog(null, "Please provide your taxable income:",
				"Taxable Income Dialog 1", JOptionPane.QUESTION_MESSAGE);
		taxIncome = Double.parseDouble(taxString);
		
		if(taxIncome >= 0 && taxIncome <= 9325)
		{
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + (0.10 * taxIncome),
					"Taxable Income Dialog 2", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(taxIncome >= 9325 && taxIncome <= 37950)
		{
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + 
					(932.50 + (0.15 * (taxIncome - 9325))), "Taxable Income Dialog 2", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(taxIncome >= 37950 && taxIncome <= 91900)
		{
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + 
					(5226.25 + (0.25 * (taxIncome - 37950))), "Taxable Income Dialog 2", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(taxIncome >= 91900 && taxIncome <= 191650)
		{
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + 
					(18713.75 + (0.28 * (taxIncome - 91900))), "Taxable Income Dialog 2", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(taxIncome >= 191650 && taxIncome <= 416700)
		{
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + 
					(46643.75 + (0.33 * (taxIncome - 191650))), "Taxable Income Dialog 2", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(taxIncome >= 416700 && taxIncome <= 418400)
		{
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + 
					(120910.25 + (0.35 * (taxIncome - 416700))), "Taxable Income Dialog 2", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if(taxIncome >= 418400)
		{
			JOptionPane.showMessageDialog(null, "Your federal income tax is $" + 
					(121505.25 + (0.396 * (taxIncome - 418400))), "Taxable Income Dialog 2", 
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}

