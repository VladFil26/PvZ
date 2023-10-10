//Kinzie Friesen
//Oct 5, 2023
//This is a class for the peashooter plant in the PvZ simulation

package PvZ;

public class Peashooter {
	static int health;
	static int  rateOfFire;
	
	public Peashooter() {
		health = 200;
		rateOfFire = 2; //every two seconds
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
	 * method for shooting bullet
	 */
	//public int shootBullet() {
	//	
	//}
}
