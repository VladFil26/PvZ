package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
	static int choise;

	public static void main(String[] args) {
		StartWindow sw=new StartWindow();
		UI ui=new UI();
		Peashooter peashooter = new Peashooter();
		Bullet bullet = new Bullet();
		Wallnut wallnut = new Wallnut();
		PotatoMine potatoMine = new PotatoMine();

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

		//For Timer
		Timer timer;
		JLabel timerLabel;
		int speed = 500;
		int num = 0;
		
		
		//Timer
		timerLabel = new JLabel("Timer");
		timerLabel.setVisible(false);
		timer = new Timer(speed, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				timerLabel.setText(String.valueOf(num));
			//	num = num + 1;
				
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
				
				//All the interactions will go here
			}
		});


	
	}
	
	/**
	 * Method to reset simulation
	 */
	public int reset() {
		
	}
}
