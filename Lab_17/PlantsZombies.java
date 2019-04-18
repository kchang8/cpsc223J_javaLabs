//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 17
//make a plants vs zombies game using jframe image elements

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class PlantsZombies extends JFrame implements KeyListener{
	private final int rows = 8;
	private final int cols = 8;
	private final int gap = 2;
	private int x = 4; //initial row
	private int y = 4; //initial col
	private int fullCounter = 0; //checks all the grid spaces if it is full
	private int counter = 0; //counts the number of times the keys are pressed
	
	//2d arrays
	private JPanel pane = new JPanel(new GridLayout(rows, cols, gap, gap));
	private JPanel[][] lawn = new JPanel[rows][cols];
	private ImageIcon[][] images = new ImageIcon[rows][cols];
	private JLabel[][] imageLabels = new JLabel[rows][cols];
	private Color green = Color.GREEN;
	private Color darkGreen = Color.GREEN.darker();
	
	//images
	ImageIcon peashooter = new ImageIcon("C:/Users/KailieT/Pictures/myPics/peaShooter.png");
	ImageIcon walnut = new ImageIcon("C:/Users/KailieT/Pictures/myPics/rock.png");
	ImageIcon sunflower = new ImageIcon("C:/Users/KailieT/Pictures/myPics/sunflower.png");
	ImageIcon zombie = new ImageIcon("C:/Users/KailieT/Pictures/myPics/zombie.png");
	
	ImageIcon plant = new ImageIcon();
	ImageIcon zombieIcon = new ImageIcon();
	
	//resizes the images
	Image transform1 = peashooter.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
	Image transform2 = walnut.getImage().getScaledInstance(80, 75, java.awt.Image.SCALE_SMOOTH);
	Image transform3 = sunflower.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH);
	Image transform4 = zombie.getImage().getScaledInstance(40, 60, java.awt.Image.SCALE_SMOOTH);
	
	public PlantsZombies()
	{
		super("Plants VS Zombies");
		add(pane);		
		int randImage = (int)(Math.random()*3 + 1);
		
		//randomizes the plant images
		if(randImage == 1)
		{
			plant = new ImageIcon(transform1);
		}
		else if(randImage == 2)
		{
			plant = new ImageIcon(transform2);
		}
		else if(randImage == 3)
		{
			plant = new ImageIcon(transform3);
		}
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				lawn[i][j] = new JPanel();
				pane.add(lawn[i][j]);
	
				images[i][j] = new ImageIcon();
				imageLabels[i][j] = new JLabel();
				//colors the lawn
				if(i % 2 == 0)
				{
					lawn[i][j].setBackground(green);
				}
				else
				{
					lawn[i][j].setBackground(darkGreen);
				}
				//sets the initial random plant at the position
				if(i == 4 && j == 4)
				{
					imageLabels[x][y].setIcon(plant);
				}
				else
				{
					imageLabels[i][j] = new JLabel("");
				}
				lawn[i][j].add(imageLabels[i][j]);
			}
		}
		
		addKeyListener(this);
	}
	//spawns zombie function
	public void spawnZombie()
	{
		int rowX = (int)(Math.random()*8);
		int colY = (int)(Math.floor(Math.random()*2 + 6));
		
		//if the spot is empty, place the zombie 
		if(images[rowX][colY].getImage() == null)
		{
			images[rowX][colY].setImage(transform4);
			imageLabels[rowX][colY].setIcon(images[rowX][colY]);
			fullCounter++;
			return;
		}
		else if(fullCounter < 16)
		{
			spawnZombie();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
		int randImg = (int)(Math.random()*3 +1);
		
		//checks the keys pressed
		if(keyCode == KeyEvent.VK_UP)
		{
			if(x - 1 >= 0)
			{
				imageLabels[x][y].setIcon(images[x][y]);
				imageLabels[x-1][y].setIcon(plant);
				x = x - 1;
				counter++;
			}
		}
		else if(keyCode == KeyEvent.VK_DOWN)
		{
			if(x + 1 <= 7)
			{
				imageLabels[x][y].setIcon(images[x][y]);
				imageLabels[x+1][y].setIcon(plant);
				x = x + 1;
				counter++;
			}
		}
		else if(keyCode == KeyEvent.VK_RIGHT)
		{
			if(y + 1 <= 7)
			{
				imageLabels[x][y].setIcon(images[x][y]);
				imageLabels[x][y+1].setIcon(plant);
				y = y + 1;
				counter++;
			}
		}
		else if(keyCode == KeyEvent.VK_LEFT)
		{
			if(y-1 >= 0)
			{
				imageLabels[x][y].setIcon(images[x][y]);
				imageLabels[x][y-1].setIcon(plant);
				y = y - 1;
				counter++;
			}
		}
		else if(keyCode == KeyEvent.VK_SPACE) 
		{
			if(images[x][y].getImage() == null)
			{
				images[x][y] = plant;
				
				if(randImg == 1)
				{
					plant = new ImageIcon(transform1);
				}
				else if(randImg == 2)
				{
					plant = new ImageIcon(transform2);
				}
				else if(randImg == 3)
				{
					plant = new ImageIcon(transform3);
				}
				imageLabels[x][y].setIcon(plant);
			}
		}
		//if the keys pressed equals 4
		if(counter == 4)
		{
			counter = 0; //resets the counter to 0
			spawnZombie();
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//main
	public static void main(String[] args) {
		PlantsZombies frame = new PlantsZombies();
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
