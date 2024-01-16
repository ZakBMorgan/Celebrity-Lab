import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SimpleGUIRunner
{
	public static void main(String[] args)
	{
		JFrame sample = new JFrame();
		
		//look through the setters of the class. Is there one
		//to set the size?
		sample.setSize(800, 600);
		
		//set a layout manager to manage how things
		//are placed on the JFrame
		sample.setLayout(new FlowLayout(FlowLayout.LEFT)); //<-- Flowlayout will try to use
											//all the row width first!
		
		//assign closing x button to stopping the program
		sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
//		//Adding components or "widgets" to the JFrame
//		JButton start = new JButton("START");
//		
//		//size
//		start.setPreferredSize(new Dimension(800,200));
//				
//		//background color
//		start.setBackground(new Color(255, 181, 59));
//				
//		//font size
//		start.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 60));
//		
//		
//		//Ok, exploration time. How do you add this
//		//to the JFrame object?!
//		sample.add(start); //<-- there's an add method!!!
//		
//		
//		//Can you try to add a 2nd button?!
//		//have it say "poops"
//		JButton poops = new JButton("POOPS");
//		
//		sample.add(poops);
//		
//		JLabel label = new JLabel("Enter your guess");
//		JTextField field = new JTextField("What is your guess?");
//		
//		sample.add(label);
//		sample.add(field);
//		
//		JCheckBox skip = new JCheckBox("skip?");
//		
//		sample.add(skip);
//		
//		JToggleButton mode = new JToggleButton("hard mode?");
//		
//		sample.add(mode);
		
		/**
		 * Additional Exploration:
		 * 		
		 * 		Set the color of one of your buttons to GOLD.
		 * 		Make one of the buttons be as wide as the JFrame width!
		 *
		 */
		
		
		JRadioButton select1 = new JRadioButton("Celebrity");
		JLabel count = new JLabel("Current Celebrity Count: 0");
		JRadioButton select2 = new JRadioButton("Literature Celebrity");
		
		
		sample.add(select1);
		sample.add(count);
		sample.add(select2);
		
		JTextField field1 = new JTextField("Type celebrity here (4 letters minimum)");
		
		field1.setPreferredSize(new Dimension(750, 20));
		
		JLabel label1 = new JLabel("Enter the clue for the celebrity");
		
		JTextField field2 = new JTextField("Type celebrity here (10 letters minimum)");
		
		field2.setPreferredSize(new Dimension(750, 20));
		
		sample.add(field1);
		sample.add(label1);
		sample.add(field2);
		
		JButton button1 = new JButton("Add current celebrity");
		
		button1.setPreferredSize(new Dimension(750, 20));
		
		sample.add(button1);
		
		JButton start = new JButton("Start Celebrity Game");
		
		start.setPreferredSize(new Dimension(750, 20));
		
		start.setEnabled(false);
		
		sample.add(start);
		
		
		sample.setVisible(true);
	}

}
