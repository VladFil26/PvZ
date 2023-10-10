//Kinzie Friesen
//Oct 5, 2023
//This is a class for the Peashooter's bullet in the PvZ simulation

package PvZ;

public class Bullet {
	static int health;
	static int damage;
	static int speed;
		
		public Bullet() {
			health = 200;
			damage = 100;
			speed = 1; //1 square every second
		}
		
		/**
		 * Method for getting health
		 */
		public int getHealth() {
			return health;
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
		
		/**
		 * Method for resetting health
		 */
		public int resetbHealth() {
			health = 200;
			return health;
		}
}
