
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.sqrt;

public class Calculator extends JFrame implements ActionListener {
	final int FRAME_WIDTH = 300;
	final int FRAME_HEIGHT = 150;
	JLabel heading1;
	JLabel heading2;
	JTextField num1;
	JTextField num2;
	JButton mult;
	JButton sub;
	JButton div;
	JButton addition;
	
	public Calculator()
	{
		super("Calculator");
		
		heading1 = new JLabel("     Calculator Application     ");
		num1 = new JTextField(10);
		num2 = new JTextField(10);
		mult = new JButton("X");
		sub = new JButton("-");
		div = new JButton("/");
		addition = new JButton("+");
		heading2 = new JLabel("");
		
		//makes frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//hover tool tips
		num1.setToolTipText("Press Enter for pow 2");
		num2.setToolTipText("Press Enter for sqrt");
		
		//sets fonts
		heading1.setFont(new Font("Arial", Font.BOLD, 16));
		num1.setFont(new Font("Arial", Font.BOLD, 14));
		num2.setFont(new Font("Arial", Font.BOLD, 14));
		heading2.setFont(new Font("Arial", Font.BOLD, 16));
		
		num1.addActionListener(this);
		num2.addActionListener(this);
		mult.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		addition.addActionListener(this);
		
		//sets frame layout
		setLayout(new FlowLayout());
		add(heading1);
		add(num1);
		add(num2);
		add(mult);
		add(sub);
		add(div);
		add(addition);
		add(heading2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		String numString1, numString2;
		int first, second;
		double result;
		
		try
		{
			numString1 = num1.getText();
			first = Integer.parseInt(numString1);
		}
		catch(Exception ex)
		{
			first = 0;
			num1.setText("0");
		}
		try
		{
			numString2 = num2.getText();
			second = Integer.parseInt(numString2);
		}
		catch(Exception ex)
		{
			second = 0;
			num2.setText("0");
		}
		
		if(source == mult)
		{
			result = first * second;
			heading1.setText("Calulator Application");
			heading2.setText("      " + "        " + "        " + "        " + "  " + result);
		}
		else if(source == sub)
		{
			result = first - second;
			heading1.setText("Calulator Application");
			heading2.setText("      " + "        " + "        " + "        " + "  " + result);
		}
		else if(source == div)
		{
			result = first/second;
			heading1.setText("Calulator Application");
			heading2.setText("      " + "        " + "        " + "        " + result);
		}
		else if(source == addition)
		{
			result = first + second;
			heading1.setText("Calulator Application");
			heading2.setText("      " + "        " + "        " + "        " + result);
		}
		else if(source == num1)
		{
			result = first * first;
			heading2.setText("      " + "        " + "        " + "        " + result);
		}
		else if(source == num2)
		{
			result = sqrt(second);
			heading2.setText("      " + "        " + "        " + "        " + result);
		}
	}
	
}
