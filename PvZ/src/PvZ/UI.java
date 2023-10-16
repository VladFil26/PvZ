package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class UI {
	static int choise;
	static int limit;
	static Timer timer;
	static int num;
	public JFrame frame = new JFrame("PvZ Simulation");
	JPanel contentPane = new JPanel(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	public JButton[][] board = new JButton[5][9];
	public JButton[] menu = new JButton[4];
	ImageIcon imageTile, imagePeaShooter, imageWallNut, imagePotatoMine, imageBackground, imageZombie, image2Zombies,
			imageShovel;
	String[][] a = { { "00", "10", "20", "30", "40", "50", "60", "70", "80" },
			{ "01", "11", "21", "31", "41", "51", "61", "71", "81" },
			{ "02", "12", "22", "32", "42", "52", "62", "72", "85" },
			{ "03", "13", "23", "33", "43", "53", "63", "73", "83" },
			{ "04", "14", "24", "34", "44", "54", "64", "74", "84" }, };
	String[] b = { "0", "1", "2", "3" };

	Peashooter[] peashooterArray = new Peashooter[0]; // better to use class of plant instead of 2d arrays
//	Bullet[] bullet = new Bullet();
	Wallnut[] wallnutArray = new Wallnut[0];
	PotatoMine[] potatoMineArray = new PotatoMine[0];
	Zombie[] zombieArray = new Zombie[0];

	public UI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.setLocationRelativeTo(null);
		imagePeaShooter = new ImageIcon("res//PeaShooter.png");
		imageBackground = new ImageIcon("res//backround.png");
		imageWallNut = new ImageIcon("res//WallNut.png");
		imagePotatoMine = new ImageIcon("res//PotatoMine.png");
		imageTile = new ImageIcon("res//R.png");
		imageZombie = new ImageIcon("res//ZombieR.png");
		image2Zombies = new ImageIcon("res//2ZombieR.png");
		imageShovel = new ImageIcon("res//shovel.png");
		c.gridy = 0;
		for (int i = 0; i < menu.length; i++) {
			c.gridx = i;
			menu[i] = new JButton();
			menu[i].setPreferredSize(new Dimension(90, 90));
			contentPane.add(menu[i], c);

		}
		menu[0].setIcon(imagePeaShooter);
		menu[1].setIcon(imageWallNut);
		menu[2].setIcon(imagePotatoMine);
		menu[3].setIcon(imageShovel);

		for (int i = 0; i < board.length; i++) {// create board
			c.gridy = i + 1;
			for (int j = 0; j < board[0].length; j++) {
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
						if (y != board[0].length - 1) {
							switch (choise) {
							case 0:
								if (board[x][y].getIcon() == imageTile)
									board[x][y].setIcon(imagePeaShooter);
								Peashooter ps = new Peashooter(x, y);
								Peashooter[] temp = new Peashooter[peashooterArray.length + 1]; // temporary array with
																								// 1 more space for
																								// plants
								for (int i = 0; i < peashooterArray.length; i++) {
									temp[i] = peashooterArray[i];
								}
								temp[peashooterArray.length] = ps;
								peashooterArray = temp;
								// System.out.print(peashooterArray.length);
								// = peashooter.getHealth();
								break;
							case 1:
								if (board[x][y].getIcon() == imageTile)
									board[x][y].setIcon(imageWallNut);
								Wallnut wn = new Wallnut(x, y);
								Wallnut[] temp2 = new Wallnut[wallnutArray.length + 1]; // temporary array with 1 more
																						// space for plants
								for (int i = 0; i < wallnutArray.length; i++) {
									temp2[i] = wallnutArray[i];
								}
								temp2[wallnutArray.length] = wn;
								wallnutArray = temp2;
								// wallnutArray[x][y] = wallnut.getHealth();
								break;
							case 2:
								if (board[x][y].getIcon() == imageTile)
									board[x][y].setIcon(imagePotatoMine);
								PotatoMine pm = new PotatoMine(x, y);
								PotatoMine[] temp3 = new PotatoMine[potatoMineArray.length + 1]; // temporary array with
																									// 1 more space for
																									// plants
								for (int i = 0; i < potatoMineArray.length; i++) {
									temp3[i] = potatoMineArray[i];
								}
								temp3[potatoMineArray.length] = pm;
								potatoMineArray = temp3;
								// potatoMineArray[x][y] = potatoMine.getHealth();
								break;
							case 3:
								if (board[x][y].getIcon() != imageTile) {
									board[x][y].setIcon(imageTile);
								/*	for (int i = 0; i < potatoMineArray.length; i++) {
										if (potatoMineArray[i].getX() == x && potatoMineArray[i].getY() == y) {
											for (int j = i; j < potatoMineArray.length; j++) {
												
											}
										}
									}*/
								}
								break;
							default:
								choise = -1;
								break;
							}
							choise = -1;
						}
					}
				});
			}
		}

		// For Timer
		int speed = 500;
		num = 0;

		// Timer
		timer = new Timer(speed, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num = num + 1;
				Zombie zomb = new Zombie();
				Zombie[] temp = new Zombie[zombieArray.length + 1]; 
				for (int i = 0; i < zombieArray.length; i++) {
					temp[i] = zombieArray[i];
				}
				temp[zombieArray.length] = zomb;
				zombieArray = temp;
System.out.println("+1");
				// All the interactions will go here

			}
		});

		frame.setContentPane(contentPane);
		// frame.setVisible(true);
	}

	/**
	 * Method to reset simulation
	 */
	public void reset() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {

				board[i][j].setIcon(imageTile);
			}
		}
		// peashooter.resetpsHealth();
		// bullet.resetbHealth();
		// wallnut.resetwHealth();
		// potatoMine.resetpmHealth();
		// zombie reset health
	}
public void update() {
	for (int k = 0; k < zombieArray.length; k++) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(zombieArray[k].getX()==i&&zombieArray[k].getY()==j)
					if(board[i][j].getIcon()==imageTile)
				board[i][j].setIcon(imageZombie);
			}
		}
}
}
}
