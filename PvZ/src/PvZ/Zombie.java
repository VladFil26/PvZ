
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
	// private Timer timer;
	// private int speed, num;

	public void eatPlant(Peashooter[] peashooters, PotatoMine[] potatomines, Wallnut[] wallnuts) {
		boolean t = false;
		for (int i = 0; i < peashooters.length; i++) {
			if (peashooters[i].getX() == x && peashooters[i].getY() == y) {
				peashooters[i].setHealth(-100);
				peashooters=(Peashooter[])removePlant(peashooters,i);
				
				t = true;
				System.out.println("Eating peashooter");
			}
		}
		if (t) {
			for (int i = 0; i < potatomines.length; i++) {
				if (potatomines[i].getX() == x && potatomines[i].getY() == y) {
					potatomines[i].setHealth(-100);
					potatomines=(PotatoMine[])removePlant(potatomines,i);
					t = true;
					System.out.println("Eating potatomines");

				}

			}
		}
		if (t) {
			for (int i = 0; i < wallnuts.length; i++) {
				if (wallnuts[i].getX() == x && wallnuts[i].getY() == y) {
					wallnuts[i].setHealth(-100);
					t = true;
					System.out.println("Eating wallnuts");
				}
			}
		}
		if (!t && y >= 1) {
			// System.out.println("move");
			y--;
		}
	}

	/**
	 * Method to start timer
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
public Object[] removePlant(Object[] plantarray,int num) {
	Object[] temp=new Object[plantarray.length-1];
	for(int i=0;i<num;i++) {
		temp[i]=plantarray[i];
	}
	for(int i=num;i<=temp.length;i++) {
		temp[i]=plantarray[i+1];
	}
	return temp;
}
	// Constructor
	public Zombie() {
		Random r = new Random();
		x = r.nextInt(0, 4);
		y = 9;
	}

}
