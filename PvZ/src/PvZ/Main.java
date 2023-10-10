package PvZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Main {
	static int choise;
	static Timer timer;
	static int num;

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
		int speed = 500;
		num = 0;
		
		
		//Timer
		
		timer = new Timer(speed, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num = num + 1;
				
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
}
