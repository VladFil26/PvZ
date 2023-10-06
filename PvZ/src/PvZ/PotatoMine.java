//Kinzie Friesen
//Oct 6, 2023

package PvZ;

public class PotatoMine {
	private int pmHealth;
	private int damage;
	
	public PotatoMine() {
		pmHealth = 200;
		damage = 200;

	}
	
	/**
	 * Method to get potatomine's health
	 */
	public int getHealth() {
		return pmHealth;
	}
	
	/**
	 * Method to explode. (aka. give damage to zombie, and take damage itself
	 */
	public int explode() {
		pmHealth = 0;
		return damage;
	}
}
