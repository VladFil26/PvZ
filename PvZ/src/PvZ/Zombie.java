package PvZ;

import java.util.Random;
import javax.swing.*;

public class Zombie {
	int healts;
	int damage=-100;
	int x, y;

	// Constructor
	public Zombie() {
		Random r = new Random();
		x = r.nextInt(0, 4);
		y = 9;
	}
	
	public void eatPlant(Peashooter[] peashooters, PotatoMine[] potatomines, Wallnut[] wallnuts) {
		boolean t = false;
		for (int i = 0; i < peashooters.length; i++) {
			if (peashooters[i].getX() == x && peashooters[i].getY() == y) { //checking peashooters array with same x and y
				if (peashooters[i].getHealth() > 0) {
					peashooters[i].setHealth(damage);
				} else {
					peashooters[i].setY(10);
				}
				t = true;
				//System.out.println("Eating peashooter");
			}
		}

		for (int i = 0; i < potatomines.length; i++) { //checking potatomines array with same x and y
			if (potatomines[i].getX() == x && potatomines[i].getY() == y) {
				if (potatomines[i].getHealth() > 0) {
					potatomines[i].setHealth(damage);
				} else
					potatomines[i].setY(10);
				t = true;
				//System.out.println("Eating potatomines");
			}
		}
		for (int i = 0; i < wallnuts.length; i++) { //checking wallnuts array with same x and y
			if (wallnuts[i].getX() == x && wallnuts[i].getY() == y) {
				if (wallnuts[i].getHealth() > 0) {
					wallnuts[i].setHealth(damage);
				} else {
					wallnuts[i].setY(10);
				}
				t = true;
				//System.out.println("Eating wallnuts");
			}
		}

		if (!t && y >= 1) {
			// System.out.println("move");
			y--;
		}
	}

	public ImageIcon ZombPlantImage(UI ui) { // method for setting image zombie with plant
		for (int i = 0; i < ui.peashooterArray.length; i++) {
			if (ui.peashooterArray[i].getX() == x && ui.peashooterArray[i].getY() == y) {
				return ui.imagePeaShooterZombie;
			}
		}
		for (int i = 0; i < ui.potatoMineArray.length; i++) {
			if (ui.potatoMineArray[i].getX() == x && ui.potatoMineArray[i].getY() == y) {
				return ui.imagePotatoMineZombie;
			}
		}
		for (int i = 0; i < ui.wallnutArray.length; i++) {
			if (ui.wallnutArray[i].getX() == x && ui.wallnutArray[i].getY() == y) {
				return ui.imageWallNutZombie;
			}
		}
		return ui.imageZombie;

	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
