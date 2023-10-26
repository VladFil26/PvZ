package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WL_Window {
	public boolean restart=false;
	public JFrame frame;
	JPanel contentPane = new JPanel(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	JButton button1 = new JButton("Try again!");
	JLabel label1;

	public WL_Window(String s) {
		frame = new JFrame("You " + s);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		label1 = new JLabel("You " + s);
		c.gridy = 0;
		contentPane.add(label1, c);
		c.gridy = 1;
		contentPane.add(button1, c);
		frame.setContentPane(contentPane);
		frame.setVisible(true);
	}
	public void buttonPress(UI ui) {
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				restart=true;
			}

		});

	}
}
