package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
	static int choise;

	public static void main(String[] args) {
		JFrame frame;
		JButton[] menu = new JButton[4];
		JButton[][] board = new JButton[5][9];
		JPanel contentPane,contentPane2;
		frame = new JFrame("PvZ");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		GridBagConstraints c = new GridBagConstraints();
		frame.setLocationRelativeTo(null);
		contentPane = new JPanel(new GridBagLayout());
		
		//For Timer
		Timer timer;
		JLabel timerLabel;
		int speed = 500;
		int num = 0;
		
		//instructionframe.setLocationRelativeTo(null);
		
		ImageIcon imageTile, imagePeaShooter, imageWallNut, imagePotatoMine, imageBackground, imageZombie,
				image2Zombies, imageShovel;
		
		imagePeaShooter = new ImageIcon("res//PeaShooter.png");
		imageBackground = new ImageIcon("res//backround.png");
		imageWallNut = new ImageIcon("res//WallNut.png");
		imagePotatoMine = new ImageIcon("res//PotatoMine.png");
		imageTile = new ImageIcon("res//R.png");
		imageZombie = new ImageIcon("res//ZombieR.png");
		image2Zombies = new ImageIcon("res//2ZombieR.png");
		imageShovel = new ImageIcon("res//shovel.png");
		String[][] a = { { "00", "10", "20", "30", "40", "50", "60", "70", "80" },
				{ "01", "11", "21", "31", "41", "51", "61", "71", "81" },
				{ "02", "12", "22", "32", "42", "52", "62", "72", "85" },
				{ "03", "13", "23", "33", "43", "53", "63", "73", "83" },
				{ "04", "14", "24", "34", "44", "54", "64", "74", "84" }, };
		String[] b = { "0", "1", "2", "3" };
		// setLayout(new BorderLayout);
		// c.gridheight=6;
		// c.gridwidth=10;
		// contentPane.add( new JLabel(imageBackground),c);
		
		c.gridy = 0;
		for (int i = 0; i < menu.length; i++) {
			c.gridx = i;
			menu[i] = new JButton();
			menu[i].setPreferredSize(new Dimension(90, 90));
			contentPane.add(menu[i], c);
			// c.gridheight=1;
			// c.gridwidth=1;

		}
		menu[0].setIcon(imagePeaShooter);
		menu[1].setIcon(imageWallNut);
		menu[2].setIcon(imagePotatoMine);
		menu[3].setIcon(imageShovel);

		for (int i = 0; i < board.length; i++) {// create board
			c.gridy = i + 1;
			for (int j = 0; j < board[0].length; j++) {
				// c.gridheight=1;
				// c.gridwidth=1;
				board[i][j] = new JButton();
				board[i][j].setPreferredSize(new Dimension(90, 90));
				c.gridx = j;
				board[i][j].setIcon(imageTile);
				contentPane.add(board[i][j], c);
			}
		}
		for (int i = 0; i < menu.length; i++) {
			menu[i].setActionCommand(b[i]);
			menu[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int x = Integer.valueOf(e.getActionCommand());
					// System.out.println(x);
					choise = x;
				}
			});
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j].setActionCommand(a[i][j]);
				board[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int y = Integer.valueOf(e.getActionCommand().substring(0, 1)); // -current index
						int x = Integer.valueOf(e.getActionCommand().substring(1));// -current index
						if(y!=board[0].length-1) {
							switch (choise) {
							case 0:
								if (board[x][y].getIcon() == imageTile) 
								board[x][y].setIcon(imagePeaShooter);
								break;
							case 1:
								if (board[x][y].getIcon() == imageTile) 
								board[x][y].setIcon(imageWallNut);
								break;
							case 2:
								if (board[x][y].getIcon() == imageTile) 
								board[x][y].setIcon(imagePotatoMine);
								break;
							case 3:
								if (board[x][y].getIcon() != imageTile) 
								  board[x][y].setIcon(imageTile);
								break;
							default:
								choise = -1;
								break;
							}
							choise = -1;
//ggg
						}
					}
				});
			}
		}
		
		//Timer
		timerLabel = new JLabel("Timer");
		timerLabel.setVisible(false);
		timer = new Timer(speed, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				timerLabel.setText(String.valueOf(num));
				num = num + 1;
				
				
				//All the interactions will go here
			}
		});
	
		
		frame.setContentPane(contentPane);
		frame.setVisible(true);

		
		//Arrays
		int[][] zombieArray;
		int[][] peaArray;
		int[][] peashooterArray;
		int[][] wallnutArray;
		int[][] potatoArray;
		
		zombieArray = new int[5][9];
		peaArray = new int[5][9];
		peashooterArray = new int[5][9];
		wallnutArray = new int[5][9];
		potatoArray = new int[5][9];
		
	}
}
