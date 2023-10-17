//Kinzie Friesen
//Oct 5, 2023
//This is a class for the Wallnut plant in PvZ simulation

package PvZ;

public class Wallnut extends Plant {
	static int health;
	int x, y;

	public Wallnut(int x, int y) {
		super(x, y, 400);
	}

	/**
	 * Method for getting wallnut health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Method for resetting health
	 */
	public int resetwHealth() {
		health = 400;
		return health;
	}

	// public int getX() {
	// return x;
//	}

//	public int getY() {
	// return y;
	// }
}
