/*
 * Oct - Nov 2023
 * Zombie class
 */
package PvZ;

import java.util.Random;
import javax.swing.*;

public class Zombie {
	int health;
	int damage = -100;

	int x, y;

	public Zombie() {
		Random r = new Random();
		x = r.nextInt(0, 4);
		y = 9;
		health = 200;
	}

	/**
	 * Method for eating plant
	 * @param peashooters
	 * @param potatomines
	 * @param wallnuts
	 */
	public void eatPlant(Peashooter[] peashooters, PotatoMine[] potatomines, Wallnut[] wallnuts) {
		if (health > 0) {
			boolean t = false;
			for (int i = 0; i < peashooters.length; i++) {
				if (peashooters[i].getX() == x && peashooters[i].getY() == y) { // checking peashooters array with same
																				// x and y
					if (peashooters[i].getHealth() > 0) {
						peashooters[i].setHealth(damage);
					} else {
						peashooters[i].setY(10);
					}
					t = true;
				}
			}

			for (int i = 0; i < potatomines.length; i++) { // checking potatomines array with same x and y
				if (potatomines[i].getX() == x && potatomines[i].getY() == y) {
					if (potatomines[i].getHealth() > 0) {
						health = -potatomines[i].explode();
						y = 10;
					} else
						potatomines[i].setY(10);
					t = true;

				}
			}
			for (int i = 0; i < wallnuts.length; i++) { // checking wallnuts array with same x and y
				if (wallnuts[i].getX() == x && wallnuts[i].getY() == y) {
					if (wallnuts[i].getHealth() > 0) {
						wallnuts[i].setHealth(damage);
					} else {
						wallnuts[i].setY(10);
					}
					t = true;

				}
			}

			if (!t && y >= 1) {
				y--;
			}
		} else {
			setY(10);
		}
	}

	/**
	 * Method for setting zombie image with plant (When it's eating plant) 
	 * @param ui
	 * @return
	 */
	public ImageIcon ZombPlantImage(UI ui) { 
		for (int i = 0; i < ui.peashooterArray.length; i++) {
			if (ui.peashooterArray[i].getX() == x && ui.peashooterArray[i].getY() == y) {
				return ui.imagePeaShooterZombie;
			}
		}
		for (int i = 0; i < ui.potatoMineArray.length; i++) {
			if (ui.potatoMineArray[i].getX() == x && ui.potatoMineArray[i].getY() == y) {
				return ui.imagePotatoMineExpl;
			}
		}
		for (int i = 0; i < ui.wallnutArray.length; i++) {
			if (ui.wallnutArray[i].getX() == x && ui.wallnutArray[i].getY() == y) {
				return ui.imageWallNutZombie;
			}
		}
		return ui.imageZombie;

	}

	/*
	 * Methods to get / set coordinates
	 */
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	/*
	 * Methods to get / set health
	 */
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int hp) {
		health += hp;
	}

}
