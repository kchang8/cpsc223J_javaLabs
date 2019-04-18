
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiceGame extends JFrame implements ActionListener, ItemListener{
	int initialCash = 1000;
	//north button
	JTextField nb = new JTextField("Welcome To The High Rollers Game");
	//west buttons
	JTextField wb = new JTextField("Cash Available");
	JTextField showCash = new JTextField("$" + initialCash);
	//east buttons
	JButton eb = new JButton("Cash Out");
	String[] betArray = {"Quick Bet", "$100", "$350", "$500"};
	JComboBox bet = new JComboBox(betArray);
	//south buttons
	JButton sb = new JButton(" Roll Dice ");
	JTextField winLose = new JTextField();
	JTextField diceResult = new JTextField();
	//center buttons
	JButton d1 = new JButton("D1");
	JButton d2 = new JButton("D2");
	JButton d3 = new JButton("D3");
	JTextField cb = new JTextField("Place your Bet");
	JTextField customBet = new JTextField(10);
	
	//panels
	JPanel centerPanel = new JPanel();
	JPanel westPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	JPanel southPanel = new JPanel();
	
	public DiceGame()
	{
		super("Casino Simulator");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		//sets fonts
		nb.setFont(new Font("Arial", Font.BOLD, 20));
		wb.setFont(new Font("Arial", Font.BOLD, 14));
		cb.setFont(new Font("Arial", Font.BOLD, 12));
		winLose.setFont(new Font("Arial", Font.BOLD, 12));
		diceResult.setFont(new Font("Arial", Font.BOLD, 12));
		
		//makes border layout
		add(nb, BorderLayout.NORTH);
		add(westPanel, BorderLayout.WEST);
		add(eastPanel, BorderLayout.EAST);
		add(southPanel, BorderLayout.SOUTH);
		add(centerPanel, BorderLayout.CENTER);
		
		//editables and listeners
		nb.setEditable(false);
		wb.setEditable(false);
		showCash.setEditable(false);
		cb.setEditable(false);
		winLose.setEditable(false);
		diceResult.setEditable(false);
		eb.addActionListener(this);
		sb.addActionListener(this);
		bet.addItemListener(this);
		
		//west Panels
		westPanel.setLayout(new GridLayout(2, 1));
		westPanel.add(wb);
		westPanel.add(showCash);
		
		//center panels
		centerPanel.setLayout(new FlowLayout());
		centerPanel.add(d1);
		centerPanel.add(d2);
		centerPanel.add(d3);
		centerPanel.add(cb);
		centerPanel.add(customBet);
		
		//east panels
		eastPanel.setLayout(new GridLayout(2, 1));
		eastPanel.add(eb);
		eastPanel.add(bet);
		
		//south panels
		southPanel.setLayout(new GridLayout(1, 3));
		southPanel.add(winLose);
		southPanel.add(sb);
		southPanel.add(diceResult);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == eb)
		{
			super.dispose();
		}
		if(source == sb)
		{
			String betString;
			int betNum;
			betString = customBet.getText();
			betNum = Integer.parseInt(betString);
			
			if(betNum > initialCash)
			{
				winLose.setText("Insufficient Funds");
			}
			else if(betNum <= initialCash)
			{
				//gets random dice numbers
				int dice1 = (int)(Math.random() * 6 + 1);
				int dice2 = (int)(Math.random() * 6 + 1);
				int dice3 = (int)(Math.random() * 6 + 1);
				//makes the integers into a string
				String num1 = Integer.toString(dice1);
				String num2 = Integer.toString(dice2);
				String num3 = Integer.toString(dice3);
				
				d1.setText(num1);
				d2.setText(num2);
				d3.setText(num3);
				//compares the dice numbers
				if(dice1 == dice2 && dice2 == dice3 && dice1 == dice3)
				{
					winLose.setText("WINNER");
					diceResult.setText("Three of a Kind!");
					initialCash = initialCash + (betNum * 4);
					showCash.setText("$" + initialCash);
				}
				else if(dice1 == dice2 || dice2 == dice3 || dice1 == dice3)
				{
					winLose.setText("WINNER");
					diceResult.setText("Two Pair!");
					initialCash += betNum;
					showCash.setText("$" + initialCash);
				}
				else
				{
					winLose.setText("LOSER");
					diceResult.setText("Better Luck next time.");
					initialCash -= betNum;
					showCash.setText("$" + initialCash);
				}
			}
		}
		
		//checks if the showCash is 0
		if(initialCash == 0)
		{
			cb.setText("Game Over");
			eb.setText("Exit");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source2 = e.getSource();
		int select = e.getStateChange();
		if(source2 == bet)
		{
			if(select == ItemEvent.SELECTED)
			{
				int positionOfSelection = bet.getSelectedIndex();
				if(positionOfSelection == 1)
				{
					customBet.setText("100");
				}
				if(positionOfSelection == 2)
				{
					customBet.setText("350");
				}
				if(positionOfSelection == 3)
				{
					customBet.setText("500");
				}
			}
		}
	}
	
}
