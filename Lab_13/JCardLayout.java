import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCardLayout extends JFrame implements ActionListener{
	private JLabel heading = new JLabel("   " + "           " + "Welcome To Mad Libs");
	private JLabel heading2 = new JLabel("   " + "           " + "Welcome To Mad Libs");
	
	private JButton next = new JButton("Next");
	private JLabel name = new JLabel("Please Enter Your Name");
	private JTextField nameField = new JTextField(10);
	private JLabel verb = new JLabel("Please Enter a Verb ending in \"ing\"");
	private JTextField verbField = new JTextField(10);
	private JLabel noun = new JLabel("Please Enter a Plural Noun");
	private JTextField nounField = new JTextField(10);
	private JLabel adj = new JLabel("Please Enter an Adjective");
	private JTextField adjField = new JTextField(10);
	private JLabel blank = new JLabel(" ");
	
	private JButton prev = new JButton("Prev");
	private JButton exit = new JButton("Exit");
	private JTextArea story = new JTextArea();
	
	//panels
	private JPanel buttonsPanel1 = new JPanel();
	private JPanel subPanel = new JPanel();
	private JPanel buttonsPanel2 = new JPanel();
	private JPanel storyPanel = new JPanel();
	
	CardLayout card = new CardLayout();
	
	public JCardLayout()
	{
		//makes frame
		super("CardLayout");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//sets layout
		setLayout(card);
		
		//action listeners and editables
		next.addActionListener(this);
		prev.addActionListener(this);
		exit.addActionListener(this);
		story.setEditable(false);
		
		//sets fonts
		heading.setFont(new Font("Arial", Font.BOLD, 20));
		heading2.setFont(new Font("Arial", Font.BOLD, 20));
		name.setFont(new Font("Arial", Font.BOLD, 12));
		verb.setFont(new Font("Arial", Font.BOLD, 12));
		noun.setFont(new Font("Arial", Font.BOLD, 12));
		adj.setFont(new Font("Arial", Font.BOLD, 12));
		
		//first panel
		buttonsPanel1.setLayout(new BorderLayout());
		buttonsPanel1.add(heading, BorderLayout.NORTH);
		subPanel.add(name, BorderLayout.CENTER);
		subPanel.add(nameField, BorderLayout.CENTER);
		subPanel.add(verb, BorderLayout.CENTER);
		subPanel.add(verbField, BorderLayout.CENTER);
		subPanel.add(noun, BorderLayout.CENTER);
		subPanel.add(nounField, BorderLayout.CENTER);
		subPanel.add(adj, BorderLayout.CENTER);
		subPanel.add(adjField, BorderLayout.CENTER);
		buttonsPanel1.add(subPanel);
		buttonsPanel1.add(next, BorderLayout.EAST);
		buttonsPanel1.add(blank, BorderLayout.SOUTH);
		add(buttonsPanel1, "Panel1");
		
		//story panel
		storyPanel.setLayout(new FlowLayout());
		storyPanel.add(story);
		
		//second panel
		buttonsPanel2.setLayout(new BorderLayout());
		buttonsPanel2.add(heading2, BorderLayout.NORTH);
		buttonsPanel2.add(prev, BorderLayout.WEST);
		buttonsPanel2.add(storyPanel, BorderLayout.CENTER);
		buttonsPanel2.add(exit, BorderLayout.EAST);
		add(buttonsPanel2, "Panel2");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == next)
		{
			String nameString = nameField.getText();
			String verbString = verbField.getText();
			String nounString = nounField.getText();
			String adjString = adjField.getText();
			
			int stories = (int)(Math.random()*2 + 1);
			if(stories == 1)
			{
				story.setText("Hi there, all you " + adjString + " little boys and girls! \n"
						+ "This is your old TV buddy, " + nameString + "! \nWith another " + adjString
						+ "-hour program of \n" + verbString + " " + nounString + " for all of you");
				card.show(getContentPane(), "Panel2");
			}
			else if(stories == 2)
			{
				story.setText("Driving a car can be fun...\nIf you follow " + nameString + "'s "
						+ adjString + " advice:\nBefore " + verbString + ", always stick your " 
						+ nounString + "\nout of the window.");
				card.show(getContentPane(), "Panel2");
			}
		}
		if(source == prev)
		{
			card.show(getContentPane(), "Panel1");
		}
		if(source == exit)
		{
			super.dispose();
		}
	}
}
