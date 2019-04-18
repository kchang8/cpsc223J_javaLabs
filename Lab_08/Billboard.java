//Kailie Chang
//CPSC 223J TuTh 8:00AM
//Lab 8: Billboard Advertisement

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import java.util.Scanner;
public class Billboard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===Welcome to the Billboard Advertisement CO.===");
		System.out.println("Please enter your Company Name");
		String companyName = input.nextLine();
		System.out.println("Please enter your Message");
		String message = input.nextLine();
		System.out.println("Please enter your Contact Info");
		String contactInfo = input.nextLine();
		
		//makes frame
		final int FRAME_WIDTH = 680;
		final int FRAME_HEIGHT = 420;
		
		JFrame frame = new JFrame("Bill Board");
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setResizable(false);
		//sets location to middle
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.gray);
		
		//inserts first input
		JLabel billboardInfo1 = new JLabel(companyName);
		billboardInfo1.setFont(new Font("Arial", Font.BOLD, 60));
		frame.add(billboardInfo1);
		
		//inserts second input
		JLabel billboardInfo2 = new JLabel(message);
		billboardInfo2.setFont(new Font("Arial", Font.BOLD, 40));
		frame.add(billboardInfo2);
		
		//inserts third input
		JLabel billboardInfo3 = new JLabel(contactInfo);
		billboardInfo3.setFont(new Font("Arial", Font.ITALIC, 40));
		frame.add(billboardInfo3);
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
	}

}
