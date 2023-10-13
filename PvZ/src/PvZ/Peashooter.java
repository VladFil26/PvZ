//Kinzie Friesen
//Oct 5, 2023
//This is a class for the peashooter plant in the PvZ simulation

package PvZ;

public class Peashooter {
	static int health;
	static int rateOfFire;
	int x, y;

	public Peashooter(int x, int y) {
		health = 200;
		rateOfFire = 2; // every two seconds
		this.x=x;
		this.y=y;
	}

	/**
	 * method for getting health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Method for resetting health
	 */
	public int resetpsHealth() {
		health = 200;
		return health;
	}

	/**
	 * Method to get rate of fire
	 * 
	 * @return
	 */
	public int getRateOfFire() {
		return rateOfFire;
	}

	/**
	 * method for shooting bullet
	 */
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
