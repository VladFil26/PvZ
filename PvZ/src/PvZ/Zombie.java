
//Zombie(s) moves left one tile on a JButton every second
//have it check if theres a plant on the left of it if so eat it, yummy!!
package PvZ;

import java.util.Random;
import java.util.Timer;
import javax.swing.*;

public class Zombie {

	int random;

	Random r = new Random();
	int healts;
	int damage;
	int x, y;

	public void eatPlant(Peashooter[] peashooters, PotatoMine[] potatomines, Wallnut[] wallnuts, Timer timer) {
		for (int i = 0; i < peashooters.length; i++) {
			if (peashooters[i].getX() == x && peashooters[i].getY() == y) {
				// timer
				peashooters[i].health -= 20;
			} else if (potatomines[i].getX() == x && potatomines[i].getY() == y) {
				// timer
				potatomines[i].health -= 20;
			} else if (wallnuts[i].getX() == x && wallnuts[i].getY() == y) {
				// timer
				wallnuts[i].health -= 20;
			} else {
				// add timer
				x++;
			}

		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Zombie() {
		Random r = new Random();
		x = r.nextInt(0, 4);
		y = 0;

	}

}
