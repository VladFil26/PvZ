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
		ImageIcon imageTile,imagePeaShooter,imageWallNut,imagePotatoMine,imageBackground;
		imagePeaShooter=new ImageIcon("res//PeaShooter.png");
		imageBackground=new ImageIcon("res//backround.png");
		imageWallNut=new ImageIcon("res//WallNut.png");
		imagePotatoMine=new ImageIcon("res//PotatoMine.png");
		imageTile = new ImageIcon("res//R.png");
	 

	//	setLayout(new BorderLayout);
		//c.gridheight=6;
		//c.gridwidth=10;
	//contentPane.add( new JLabel(imageBackground),c); 
		c.gridy=0;
		for (int i = 0; i < menu.length; i++) {
			c.gridx = i;
			menu[i] = new JButton();
			
			menu[i].setPreferredSize(new Dimension(90, 90));	
			
			contentPane.add(menu[i], c);
		//	c.gridheight=1;
		//	c.gridwidth=1;

		}
	
		menu[0].setIcon(imagePeaShooter);
		menu[1].setIcon(imageWallNut);
		menu[2].setIcon(imagePotatoMine);
		
		for (int i = 0; i < board.length; i++) {// create board
		 	
			c.gridy = i+1;
			for (int j = 0; j < board[0].length; j++) {
				//c.gridheight=1;
			//	c.gridwidth=1;
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
