//Kinzie F
//Oct 5, 2023
//This is a class for the peashooter plant in the PvZ simulation

package PvZ;

public class Peashooter {
	private int psHealth;
	private int  rateOfFire;
	
	public Peashooter() {
		psHealth = 200;
		rateOfFire = 2; //every two seconds
	}
	
	/**
	 * method for getting health
	 */
	public int getHealth() {
		return psHealth;
	}
	
	/**
	 * method for shooting bullet
	 */
	//public int shootBullet() {
	//	
	//}
}
