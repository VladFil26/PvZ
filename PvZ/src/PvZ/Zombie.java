
//Zombie(s) moves left one tile on a JButton every second
//have it check if theres a plant on the left of it if so eat it, yummy!!
package PvZ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//import java.util.Timer;
import javax.swing.*;

public class Zombie {

	int random;

	Random r = new Random();
	int healts;
	int damage;
	int x, y;
	private Timer timer;
	private int speed, num;

	public void eatPlant(Peashooter[] peashooters, PotatoMine[] potatomines, Wallnut[] wallnuts, Timer timer) {
		
		speed = 500;
		num = 0;
		timer = new Timer(speed, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num = num+1;
				System.out.println("hi");
				for (int i = 0; i < peashooters.length; i++) {
					
					if (peashooters[i].getX() == x && peashooters[i].getY() == y) {
						
						peashooters[i].health -= 100;
						
					} else if (potatomines[i].getX() == x && potatomines[i].getY() == y) {
						
						potatomines[i].health -= 100;
						
					} else if (wallnuts[i].getX() == x && wallnuts[i].getY() == y) {
						
						wallnuts[i].health -= 100;
						
					} else {
						
						x++;
					}
				}
			}
		});

	}

	
	/**
	 * Method to start timer
	 * @return
	 */
	public void timerStart() {
		timer.start();
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	//Constructor
	public Zombie() {
		Random r = new Random();
		x = r.nextInt(0, 4);
		y = 0;

	}

}
