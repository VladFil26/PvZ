package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame, winframe;
		JButton[] menu = new JButton[4];
		JButton[][] board = new JButton[5][9];
		JPanel contentPane;
		frame = new JFrame("PvZ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		GridBagConstraints c = new GridBagConstraints();
		frame.setLocationRelativeTo(null);
		contentPane = new JPanel(new GridBagLayout());
		ImageIcon imageTile,imagePeaShooter,imageWallNut,imagePotatoMine;
		imagePeaShooter=new ImageIcon("res//PeaShooter.png");
		imageWallNut=new ImageIcon("res//WallNut.png");
		imagePotatoMine=new ImageIcon("res//PotatoMine.png");
		imageTile = new ImageIcon("res//R.png");
	//	String[][] a = { { "00", "10", "20", "30", "40", "50", "60", "70" },
	//			{ "01", "11", "21", "31", "41", "51", "61", "71" }, { "02", "12", "22", "32", "42", "52", "62", "72" },
	//			{ "03", "13", "23", "33", "43", "53", "63", "73" }, { "04", "14", "24", "34", "44", "54", "64", "74" },
	//			{ "05", "15", "25", "35", "45", "55", "65", "75" }, { "06", "16", "26", "36", "46", "56", "66", "76" },
	//			{ "07", "17", "27", "37", "47", "57", "67", "77" } };
		c.gridy=0;
	
		for (int i = 0; i < menu.length; i++) {
			c.gridx = i;
			menu[i] = new JButton();
			
			menu[i].setPreferredSize(new Dimension(90, 90));	
			
			contentPane.add(menu[i], c);
		}
	
		menu[0].setIcon(imagePeaShooter);
		menu[1].setIcon(imageWallNut);
		menu[2].setIcon(imagePotatoMine);
		
		for (int i = 0; i < board.length; i++) {// create board
			c.gridy = i+1;
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = new JButton();
				board[i][j].setPreferredSize(new Dimension(90, 90));
				c.gridx = j;
				board[i][j].setIcon(imageTile);
				
				contentPane.add(board[i][j], c);
			}
		}
		frame.setContentPane(contentPane);
		frame.setVisible(true);
}
}
