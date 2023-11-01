/*
 * Oct - Nov 2023
 * Class for peashooter's bullet
 */
package PvZ;

import javax.swing.ImageIcon;

public class Bullet {
	int damage;
	int x, y, start_y;

	public Bullet(int x, int y) {
		this.x = x;
		this.y = y + 1;
		start_y = y + 1;
		damage = -100;
	}
	
	/**
	 * Method for moving bullet
	 */
	public void move() {
		if (y < 9)
			y++;
		else if (y == 9) {
			y = start_y;
		}
	}

	/**
	 * Method for setting bullet image with plant or zombie
	 * 
	 * @param ui
	 * @return
	 */
	public ImageIcon BulletXImage(UI ui) {

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
		for (int i = 0; i < ui.zombieArray.length; i++) {
			if (ui.zombieArray[i].getX() == x && ui.zombieArray[i].getY() == y) {
				ui.zombieArray[i].setHealth(damage);
				y = start_y;
				return ui.imageZombieXBullet;
			}
		}
		return ui.imageTileXBullet;

	}

	/*
	 * Methods for setting / getting coordinates
	 */
	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}