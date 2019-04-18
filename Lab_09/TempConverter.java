
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame implements ActionListener{
	final int FRAME_WIDTH = 350;
	final int FRAME_HEIGHT = 150;
	int c;
	JLabel fPrompt;
	JLabel heading1;
	JTextField numField;
	JButton button;
	JLabel heading2;
	
	public TempConverter()
	{
		super("Temperature Converter");
		
		fPrompt = new JLabel("Enter Fahrenheit");
		heading1 = new JLabel("Enter Degrees F* to recieve Degrees C*");
		numField = new JTextField(12);
		button = new JButton("Click to continue");
		heading2 = new JLabel();
		
		//makes frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		button.setToolTipText("Begin Conversion"); //hover tool tip
		heading1.setFont(new Font("Arial", Font.BOLD, 16));
		
		//sets frame layout
		setLayout(new FlowLayout());
		add(heading1);
		add(fPrompt);
		add(numField);
		add(button);
		add(heading2);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String fString = numField.getText();
		int fTemp = Integer.parseInt(fString);
		c = (fTemp - 32) * 5/9;
		heading1.setText("Enter Degrees F* to recieve Degrees C*");
		heading2.setText("Degrees Celsius " + c + "*");
	}
}
