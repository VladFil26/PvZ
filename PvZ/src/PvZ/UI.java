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
	public JFrame frame = new JFrame("PvZ");
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


	public UI() {

		Peashooter peashooter = new Peashooter();
		Bullet bullet = new Bullet();
		Wallnut wallnut = new Wallnut();
		PotatoMine potatoMine = new PotatoMine();

		
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
						}
					}
				});
			}
		}
		
		
		
		//For Timer
				int speed = 500;
				num = 0;

				// Timer
				timer = new Timer(speed, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						num = num + 1;

						// Arrays
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

						// All the interactions will go here

					}
				});
		
		
		frame.setContentPane(contentPane);
	//frame.setVisible(true);
	}
	
	
	
	public int[][] arrayPeashooter()
	{
		Peashooter peashooter = new Peashooter();
		int[][] peashooterArray;
		peashooterArray = new int[5][9];
		return peashooterArray;
	}
	
	public int[][] arrayWallnut()
	{
		Wallnut wallnut = new Wallnut();
		int[][] wallnutArray;
		wallnutArray = new int[5][9];
		return wallnutArray;
	}
	
	public int[][] arrayPotato()
	{
		PotatoMine potatoMine = new PotatoMine();
		int[][] potatoArray;
		potatoArray = new int[5][9];
		return potatoArray;
	}
	
	public int[][] arrayPea()
	{
		Bullet bullet = new Bullet();
		int[][] peaArray;
		peaArray = new int[5][9];
		return peaArray;
	}
	
	public int[][] arrayZombie()
	{
		int[][] zombieArray;
		zombieArray = new int[5][9];
		return zombieArray;
	}
	
	
	/**
	 * Method to reset simulation
	 */
	public void reset(){
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				
			}
		}
	}
	
}
