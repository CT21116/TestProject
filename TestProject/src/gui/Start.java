package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Start 
{
	
	Start()
	{
		JFrame frame = new JFrame("Git Hub");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("This is Anand");
		label.setFont(new Font("Cursor", Font.BOLD, 60));
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Start();
	}

}
