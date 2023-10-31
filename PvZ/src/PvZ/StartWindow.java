package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartWindow {

	public JFrame instructionframe;
	JPanel contentPane2 = new JPanel(new GridBagLayout());
	GridBagConstraints c2 = new GridBagConstraints();
	JButton button1 = new JButton("Start!");
	JTextField tbox1 = new JTextField(5);
	public int limit;

	public StartWindow() {
		instructionframe = new JFrame("PvZ Instructions");
		instructionframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		instructionframe.setSize(500, 300);
		instructionframe.setLocationRelativeTo(null);

		// Adding Labels and designs
		button1.setFont(new Font("Stencil", Font.PLAIN, 14));

		JLabel titleLabel = new JLabel("Plants vs. Zombies Simulation");
		titleLabel.setFont(new Font("Stencil", Font.BOLD, 22));
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setForeground(Color.BLACK);
		c2.insets = new Insets(0, 0, 10, 0);
		c2.gridy = 0;
		contentPane2.add(titleLabel, c2);

		JLabel creditsLabel = new JLabel("Created by 2023-2024 CS 40 Class");
		creditsLabel.setFont(new Font("Stencil", Font.PLAIN, 12));
		creditsLabel.setVerticalAlignment(JLabel.BOTTOM);
		c2.gridy = 1;
		contentPane2.add(creditsLabel, c2);

		JLabel label2 = new JLabel("Select how many zombies will come:");
		label2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		c2.gridy = 2;
		contentPane2.add(label2, c2);

		c2.gridy = 3;
		contentPane2.add(tbox1, c2);
		c2.gridy = 4;
		contentPane2.add(button1, c2);
		instructionframe.setContentPane(contentPane2);
		instructionframe.setVisible(true);
	}

	public void buttonPress(UI ui) {
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ui.limit = Integer.valueOf(tbox1.getText());
				ui.frame.setVisible(true);
				instructionframe.setVisible(false);
			}
		});

	}
}
