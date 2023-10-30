package PvZ;

public class PotatoMine extends Plant {
	static int damage;

	public PotatoMine(int x, int y) {
		super(x, y, 200);
		damage = 200;
	}

	/**
	 * Method to explode. (aka. give damage to zombie, and take damage itself)
	 */
	public int explode() {
		y = 10;
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

}
