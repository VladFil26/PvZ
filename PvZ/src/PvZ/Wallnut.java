//Kinzie Friesen
//Oct 5, 2023
//This is a class for the Wallnut plant in PvZ simulation

package PvZ;

public class Wallnut extends Plant {

	public Wallnut(int x, int y) {
		super(x, y, 400);
	}

	/**
	 * Method for resetting health
	 */
	public int resetwHealth() {
		health = 400;
		return health;
	}

}
