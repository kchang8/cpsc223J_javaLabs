//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 15
//creates a pixel paint program using key listeners and arrays

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class JPixelPainter extends JFrame implements KeyListener{
	private final int rows = 16;
	private final int cols = 16;
	private final int gap = 2;
	private int x = 0; //initial row
	private int y = 0; //initial col
	
	private JPanel pane = new JPanel(new GridLayout(rows, cols, gap, gap));
	//creates the grid panel with the yellow highlight
	private JPanel[][] panel = new JPanel[rows][cols];
	//color panel alternates between white and black
	private Color[][] colorPanel = new Color[rows][cols];
	private Color white = Color.WHITE;
	private Color playerColor = Color.YELLOW;
	private Color black = Color.BLACK;
	
	public JPixelPainter()
	{
		super("Pixel Painter");
		add(pane);
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				panel[i][j] = new JPanel();
				pane.add(panel[i][j]);
				
				colorPanel[i][j] = white; //makes the color panel white initially
				
				if(i == 0 && j == 0)
				{
					//sets the initial index to yellow
					panel[x][y].setBackground(playerColor);
				}
				else
				{
					panel[i][j].setBackground(colorPanel[i][j]);
				}
			}
		}
		
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
		
		//checks which key is pressed
		if(keyCode == KeyEvent.VK_UP)
		{
			if(x - 1 >= 0)
			{
				panel[x][y].setBackground(colorPanel[x][y]);
				panel[x-1][y].setBackground(playerColor);
				x = x - 1;
			}
		}
		else if(keyCode == KeyEvent.VK_DOWN)
		{
			if(x + 1 <= 15)
			{
				panel[x][y].setBackground(colorPanel[x][y]);
				panel[x+1][y].setBackground(playerColor);
				x = x + 1;
			}
		}
		else if(keyCode == KeyEvent.VK_RIGHT)
		{
			if(y + 1 <= 15)
			{
				panel[x][y].setBackground(colorPanel[x][y]);
				panel[x][y+1].setBackground(playerColor);
				y = y + 1;
			}
		}
		else if(keyCode == KeyEvent.VK_LEFT)
		{
			if(y - 1 >= 0)
			{
				panel[x][y].setBackground(colorPanel[x][y]);
				panel[x][y-1].setBackground(playerColor);
				y = y - 1;
			}
		}
		else if(keyCode == KeyEvent.VK_SPACE)
		{
			if(colorPanel[x][y] == white)
			{
				colorPanel[x][y] = black;
				panel[x][y].setBackground(playerColor);
			}
			else if(colorPanel[x][y] == black)
			{
				colorPanel[x][y] = white;
				panel[x][y].setBackground(playerColor);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		JPixelPainter frame = new JPixelPainter();
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
