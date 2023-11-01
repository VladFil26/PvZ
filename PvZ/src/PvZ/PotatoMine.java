/*
 * Oct - Nov 2023
 * Class for Potatomine Plant
 */
package PvZ;

public class PotatoMine extends Plant {
	static int damage;

	public PotatoMine(int x, int y) {
		super(x, y, 200);
		damage = 200;
	}

	/**
	 * Method to explode
	 */
	public int explode() {
		y = 10;
		health = 0;
		return damage;
	}

}
