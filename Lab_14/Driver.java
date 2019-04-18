//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 14: Run Kitty Run
//stimulates a kitty run game using JPanels with 2D arrays

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Driver extends JFrame implements ActionListener{
	private final int rows = 8;
	private final int cols = 8;
	private final int gap = 2;
	private int x = 4; //initial row
	private int y = 4; //initial col
	
	//directional buttons
	private JButton left = new JButton("LEFT");
	private JButton right = new JButton("RIGHT");
	private JButton up = new JButton("UP");
	private JButton down = new JButton("down");
	
	//2D array panels and colors
	private JPanel pane = new JPanel(new GridLayout(rows, cols, gap, gap));
	private JLabel[][] catLabel = new JLabel[rows][cols];
	private JPanel[][] panel = new JPanel[rows][cols];
	private Color color1 = Color.WHITE;
	private Color color2 = Color.GRAY;
	private Color tempColor;
	
	public Driver()
	{
		super("Run Kitty Run");
		add(pane);
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				panel[i][j] = new JPanel();
				pane.add(panel[i][j]);
				
				if(j % cols == 0)
				{
					tempColor = color1;
					color1 = color2;
					color2 = tempColor;
				}
				//sets checker board colors
				if(j % 2 == 0)
				{
					panel[i][j].setBackground(color1);
				}
				else
				{
					panel[i][j].setBackground(color2);
				}
				
				//sets cat string
				if(i == 4 && j == 4)
				{
					catLabel[x][y] = new JLabel("=^.^=");
				}
				else
				{
					catLabel[i][j] = new JLabel("");
				}
				panel[i][j].add(catLabel[i][j]);
			}
		}
		
		//make border layout
		setLayout(new BorderLayout());
		add(left, BorderLayout.WEST);
		add(right, BorderLayout.EAST);
		add(up, BorderLayout.NORTH);
		add(down, BorderLayout.SOUTH);
		add(pane, BorderLayout.CENTER);
		
		//action listeners
		left.addActionListener(this);
		right.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == left)
		{
			if(y - 1 >= 0)
			{
				catLabel[x][y].setText("");
				catLabel[x][y-1].setText("=^.^=");
				y = y - 1;
			}
		}
		if(source == right)
		{
			if(y + 1 <= 7)
			{
				catLabel[x][y].setText("");
				catLabel[x][y+1].setText("=^.^=");
				y = y + 1;
			}
		}
		if(source == up)
		{
			if(x - 1 >= 0)
			{
				catLabel[x][y].setText("");
				catLabel[x-1][y].setText("=^.^=");
				x = x - 1;
			}
		}
		if(source == down)
		{
			if(x + 1 <= 7)
			{
				catLabel[x][y].setText("");
				catLabel[x+1][y].setText("=^.^=");
				x = x + 1;
			}
		}
	}
	
	public static void main(String[] args) {
		Driver myFrame = new Driver();
		myFrame.setSize(500, 400);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}
