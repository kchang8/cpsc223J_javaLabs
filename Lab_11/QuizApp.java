
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class QuizApp extends JFrame implements ActionListener, ItemListener{
	final int FRAME_WIDTH = 310;
	final int FRAME_HEIGHT = 290;
	JLabel label;
	JLabel label2;
	JLabel q1;
	JLabel q2;
	JLabel q3;
	JLabel q4;
	JCheckBox range;
	JCheckBox space;
	JCheckBox domain;
	JCheckBox scope;
	JCheckBox priv;
	JCheckBox pub;
	JCheckBox stat;
	JCheckBox nonStat;
	JCheckBox packet;
	JCheckBox packg;
	JCheckBox bundle;
	JCheckBox gaggle;
	JButton button;
	int score = 0;
	
	//make check boxes mutually exclusive
	ButtonGroup aGroup1 = new ButtonGroup();
	ButtonGroup aGroup2 = new ButtonGroup();
	ButtonGroup aGroup3 = new ButtonGroup();
	
	//drop down menu
	String[] choiceArray = {"False", "True"};
	JComboBox choice = new JComboBox(choiceArray);
	
	public QuizApp()
	{
		super("JAVA QUIZ");
		
		label = new JLabel("   223J Quiz Application   ");
		q1 = new JLabel("    1) A variable can be referenced from its");
		q2 = new JLabel("2) Methods referenced with individual objects are");
		q3 = new JLabel("3) Most Class Data Fields are Private");
		q4 = new JLabel("   4) Java classes are stored in a folder or");
		range = new JCheckBox("Range", false);
		space = new JCheckBox("Space", false);
		domain = new JCheckBox("Domain", false);
		scope = new JCheckBox("Scope", false);
		priv = new JCheckBox("Private", false);
		pub = new JCheckBox("Public", false);
		stat = new JCheckBox("Static", false);
		nonStat = new JCheckBox("NonStatic", false);
		packet = new JCheckBox("Packet", false);
		packg = new JCheckBox("Package", false);
		bundle = new JCheckBox("Bundle", false);
		gaggle = new JCheckBox("Gaggle", false);
		button = new JButton("Submit");
		label2 = new JLabel("Score:  /20");
		
		//makes frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//sets fonts
		label.setFont(new Font("Arial", Font.BOLD, 16));
		q1.setFont(new Font("Arial", Font.ITALIC, 12));
		q2.setFont(new Font("Arial", Font.ITALIC, 12));
		q3.setFont(new Font("Arial", Font.ITALIC, 12));
		q4.setFont(new Font("Arial", Font.ITALIC, 12));
		label2.setFont(new Font("Arial", Font.BOLD, 16));
		
		//listeners
		range.addItemListener(this);
		space.addItemListener(this);
		domain.addItemListener(this);
		scope.addItemListener(this);
		priv.addItemListener(this);
		pub.addItemListener(this);
		stat.addItemListener(this);
		nonStat.addItemListener(this);
		packet.addItemListener(this);
		packg.addItemListener(this);
		bundle.addItemListener(this);
		gaggle.addItemListener(this);
		choice.addItemListener(this);
		button.addActionListener(this);
		
		//aGroups
		aGroup1.add(range);
		aGroup1.add(space);
		aGroup1.add(domain);
		aGroup1.add(scope);
		aGroup2.add(priv);
		aGroup2.add(pub);
		aGroup2.add(stat);
		aGroup2.add(nonStat);
		aGroup3.add(packet);
		aGroup3.add(packg);
		aGroup3.add(bundle);
		aGroup3.add(gaggle);
		
		//sets frame layout
		setLayout(new FlowLayout());
		add(label);
		add(q1);
		add(range);
		add(space);
		add(domain);
		add(scope);
		add(q2);
		add(priv);
		add(pub);
		add(stat);
		add(nonStat);
		add(q3);
		add(choice);
		add(q4);
		add(packet);
		add(packg);
		add(bundle);
		add(gaggle);
		add(button);
		add(label2);
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getItem();
		int select = e.getStateChange();
		//question 1 answers
		if(source == range)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == space)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == domain)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == scope)
		{
			if(select == ItemEvent.SELECTED) {
				score += 5;
			}
		}
		//question 2 answers
		if(source == priv)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == pub)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == stat)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == nonStat)
		{
			if(select == ItemEvent.SELECTED) {
				score += 5;
			}
		}
		//question 4 answers
		if(source == packet)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == packg)
		{
			if(select == ItemEvent.SELECTED) {
				score += 5;
			}
		}
		if(source == bundle)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		if(source == gaggle)
		{
			if(select == ItemEvent.SELECTED) {
				score += 0;
			}
		}
		//question 3 answers
		Object source1 = e.getSource();
		if(source1 == choice)
		{
			if(select == ItemEvent.SELECTED)
			{
				//gets index of comboSize
				int positionOfSelection = choice.getSelectedIndex();
				//index 0 is "False"
				if(positionOfSelection == 0)
				{
					score += 0;
				}
				//index 1 is "True"
				else if(positionOfSelection == 1)
				{
					score += 5;
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		label.setText("  223J Quiz Application  ");
		label2.setText("Score: " + score + "/20");
	}
}
