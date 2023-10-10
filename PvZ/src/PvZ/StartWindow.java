package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartWindow {

	public JFrame instructionframe;
	JPanel contentPane2 = new JPanel(new GridBagLayout());
	GridBagConstraints c2 = new GridBagConstraints();
	JButton button1 = new JButton("Start");
	JTextField tbox1 = new JTextField(5);
	public int limit;

	public StartWindow() {
		instructionframe = new JFrame("guide");
		instructionframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		instructionframe.setSize(500, 300);
		instructionframe.setLocationRelativeTo(null);
		JLabel label1 = new JLabel("Enter zombies limit");
		c2.gridy = 0;
		contentPane2.add(label1, c2);
		c2.gridy = 1;
		contentPane2.add(tbox1, c2);
		c2.gridy = 2;
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
