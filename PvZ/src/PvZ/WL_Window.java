package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WL_Window {
	public boolean restart = false;
	public JFrame frame;
	JPanel contentPane = new JPanel(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	JButton restartButton = new JButton("Try again?");
	JLabel winLoseLabel;

	public WL_Window(String s) {
		frame = new JFrame("End Simulation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		
		winLoseLabel = new JLabel("You " + s + "!");
		winLoseLabel.setFont(new Font("Stencil", Font.BOLD, 30));
		winLoseLabel.setBackground(Color.WHITE);
		winLoseLabel.setForeground(Color.BLACK);
	
		restartButton.setFont(new Font("Stencil", Font.PLAIN, 14));
		
		c.gridy = 0;
		contentPane.add(winLoseLabel, c);
		c.gridy = 1;
		contentPane.add( restartButton, c);
		
		frame.setContentPane(contentPane);
		frame.setVisible(true);
	}

	public void buttonPress(UI ui) {
		 restartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				restart = true;
			}

		});

	}
}
