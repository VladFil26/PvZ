//Kinzie Friesen
//Oct 6, 2023

package PvZ;

public class PotatoMine {
	static int health;
	static int damage;
	int x, y;

	public PotatoMine() {
		health = 200;
		damage = 200;

	}

	/**
	 * Method to get potatomine's health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Method to explode. (aka. give damage to zombie, and take damage itself)
	 */
	public int explode() {
		health = 0;
		return damage;
	}

	/**
	 * Method for resetting health
	 */
	public int resetpmHealth() {
		health = 200;
		return health;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
