//Kinzie Friesen
//Oct 5, 2023
//This is a class for the Peashooter's bullet in the PvZ simulation

package PvZ;

import java.util.Random;

import javax.swing.ImageIcon;

public class Bullet {
	static int health;
	static int damage;
	static int speed;
	int x, y;

	public Bullet() {
		Random r = new Random();
		health = 200;
		damage = -100;
		speed = 1000;
		x = r.nextInt(0, 4);
		y = 9;
	}

	/**
	 * Method for getting health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Method to get damage it can do
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * method to get speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Method for resetting health
	 */
	public int resetbHealth() {
		health = 200;
		return health;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/**
	 * Method for setting bullet image with plant or zombie
	 * 
	 * @param ui
	 * @return
	 */
	public ImageIcon BulletTogetherImage(UI ui) {

		for (int i = 0; i < ui.peashooterArray.length; i++) {
			if (ui.peashooterArray[i].getX() == x && ui.peashooterArray[i].getY() == y) {
				return ui.imagePeaShooterXBullet;
			}
		}
		for (int i = 0; i < ui.potatoMineArray.length; i++) {
			if (ui.potatoMineArray[i].getX() == x && ui.potatoMineArray[i].getY() == y) {
				return ui.imagePotatoMineXBullet;
			}
		}
		for (int i = 0; i < ui.wallnutArray.length; i++) {
			if (ui.wallnutArray[i].getX() == x && ui.wallnutArray[i].getY() == y) {
				return ui.imageWallNutXBullet;
			}
		}
		return ui.imageTileXBullet;

	}

	/**
	 * Method for shooting zombies
	 **/
	public void shootZombie(Zombie[] zombies) {
		boolean t = false;

		for (int i = 0; i < zombies.length; i++) {
			
			if (zombies[i].getX() == x && zombies[i].getY() == y) {
				t = true; 
				
				if (zombies[i].getHealth() > 0) {
					zombies[i].setHealth(damage);
					
					if(zombies[i].getHealth() <= 0) {
					}
					
				} else {

				}

			}
		}

		if (!t && y >= 1) {
			// System.out.println("move");
			y--;
		}

	}

}