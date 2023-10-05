//Kinzie Friesen
//Oct 5, 2023
//This is a class for the Peashooter's bullet in the PvZ simulation

package PvZ;

public class Bullet {
	private int bHealth;
	private int damage;
	private int speed;
		
		public Bullet() {
			bHealth = 200;
			damage = 100;
			speed = 1; //1 square every second
		}
		
		/**
		 * Method for getting health
		 */
		public int getHealth() {
			return bHealth;
		}
		
		/**
		 * Method to get damage it can do
		 */
		public int getDamage(){
			return damage;
		}
		
		/**
		 * method to get speed
		 */
		public int getSpeed() {
			return speed;
		}
}
