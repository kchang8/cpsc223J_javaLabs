//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 16 - Card Designer Application
//makes a card using JMenu

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class MenuBar extends JFrame implements ActionListener{
	private JMenuBar mainBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenuItem exit = new JMenuItem("Exit");
	
	//select menu
	private JMenu menu2 = new JMenu("Select");
	private JMenuItem home = new JMenuItem("Home");
	private JMenuItem conCard = new JMenuItem("Congratulations Card");
	private JMenuItem birthCard = new JMenuItem("Birthday Card");
	
	//colors menu
	private JMenu menu3 = new JMenu("Colors");
	private JMenu bright = new JMenu("Bright");
	private JMenuItem yellow = new JMenuItem("Yellow");
	private JMenuItem pink = new JMenuItem("Pink");
	private JMenu dark = new JMenu("Dark");
	private JMenuItem black = new JMenuItem("Black");
	private JMenuItem gray = new JMenuItem("Gray");
	private JMenuItem white = new JMenuItem("White");
	
	//font menu
	private JMenu menu4 = new JMenu("Font");
	private JMenuItem arial = new JMenuItem("Arial");
	private JMenuItem lucida = new JMenuItem("Lucida Handwriting");
	private JMenuItem inkFree = new JMenuItem("Ink Free");
	
	//home items
	private JLabel heading = new JLabel("               " + "Card Designer Application");
	private JTextField name = new JTextField("\"Please Enter The Recipient's Name\"");
	private JLabel heading2 = new JLabel("    " + "Then Get Started By Making Selections From the Menu");
	
	//congrats items
	private JLabel conHead = new JLabel();
	private JTextArea conMsg = new JTextArea("enter your message here");
	
	//birthday items
	private JLabel birthHead = new JLabel();
	private JTextArea birthMsg = new JTextArea("enter your message here");
	
	//panels
	private JPanel homePanel = new JPanel();
	private JPanel conPanel = new JPanel();
	private JPanel birthPanel = new JPanel();
	
	CardLayout card = new CardLayout();
	
	public MenuBar()
	{
		super("Pimp My JFrame");
		setLayout(card);
		
		//fonts
		heading.setFont(new Font("Arial", Font.BOLD, 20));
		name.setFont(new Font("Arial", Font.ITALIC, 22));
		heading2.setFont(new Font("Arial", Font.BOLD, 14));
		conHead.setFont(new Font("Ink Free", Font.PLAIN, 25));
		birthHead.setFont(new Font("Ink Free", Font.PLAIN, 25));
		
		//listeners
		exit.addActionListener(this);
		home.addActionListener(this);
		conCard.addActionListener(this);
		birthCard.addActionListener(this);
		yellow.addActionListener(this);
		pink.addActionListener(this);
		black.addActionListener(this);
		gray.addActionListener(this);
		white.addActionListener(this);
		arial.addActionListener(this);
		lucida.addActionListener(this);
		inkFree.addActionListener(this);
		
		//sets menu bars
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(exit);
		
		mainBar.add(menu2);
		menu2.add(home);
		menu2.add(conCard);
		menu2.add(birthCard);
		
		mainBar.add(menu3);
		menu3.add(bright);
		bright.add(yellow);
		bright.add(pink);
		menu3.add(dark);
		dark.add(black);
		dark.add(gray);
		menu3.add(white);
		
		mainBar.add(menu4);
		menu4.add(arial);
		menu4.add(lucida);
		menu4.add(inkFree);
		
		//home panel
		homePanel.setLayout(new GridLayout(3, 1));
		homePanel.add(heading);
		homePanel.add(name);
		homePanel.add(heading2);
		add(homePanel, "Panel1");
		
		//congrats panel
		conPanel.setLayout(new GridLayout(2, 1));
		conPanel.add(conHead);
		conPanel.add(conMsg);
		add(conPanel, "Panel2");
		
		//birthday panel
		birthPanel.setLayout(new GridLayout(2, 1));
		birthPanel.add(birthHead);
		birthPanel.add(birthMsg);
		add(birthPanel, "Panel3");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		
		if(source == exit)
		{
			System.exit(0);
		}
		else if(source == home)
		{
			card.show(getContentPane(), "Panel1");
		}
		else if(source == conCard)
		{
			conHead.setText("        " + "Congratulations " + name.getText());
			card.show(getContentPane(), "Panel2");
		}
		else if(source == birthCard)
		{
			birthHead.setText("        " + "Happy Birthday " + name.getText());
			card.show(getContentPane(), "Panel3");
		}
		//sets background color
		else if(source == yellow)
		{
			homePanel.setBackground(Color.YELLOW);
			conPanel.setBackground(Color.YELLOW);
			birthPanel.setBackground(Color.YELLOW);
		}
		else if(source == pink)
		{
			homePanel.setBackground(Color.PINK);
			conPanel.setBackground(Color.PINK);
			birthPanel.setBackground(Color.PINK);
		}
		else if(source == black)
		{
			homePanel.setBackground(Color.BLACK);
			conPanel.setBackground(Color.BLACK);
			birthPanel.setBackground(Color.BLACK);
		}
		else if(source == gray)
		{
			homePanel.setBackground(Color.GRAY);
			conPanel.setBackground(Color.GRAY);
			birthPanel.setBackground(Color.GRAY);
		}
		else if(source == white)
		{
			homePanel.setBackground(Color.WHITE);
			conPanel.setBackground(Color.WHITE);
			birthPanel.setBackground(Color.WHITE);
		}
		//sets fonts for message
		else if(source == arial)
		{
			conMsg.setFont(new Font("Arial", Font.PLAIN, 12));
			birthMsg.setFont(new Font("Arial", Font.PLAIN, 12));
		}
		else if(source == lucida)
		{
			conMsg.setFont(new Font("Lucida HandWriting", Font.PLAIN, 12));
			birthMsg.setFont(new Font("Lucida HandWriting", Font.PLAIN, 12));
		}
		else if(source == inkFree)
		{
			conMsg.setFont(new Font("Ink Free", Font.PLAIN, 12));
			birthMsg.setFont(new Font("Ink Free", Font.PLAIN, 12));
		}
	}
	
	//main
	public static void main(String[] args) {
		MenuBar frame = new MenuBar();
		frame.setSize(450, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
