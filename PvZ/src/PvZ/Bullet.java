//Kinzie Friesen
//Oct 5, 2023
//This is a class for the Peashooter's bullet in the PvZ simulation

package PvZ;

import java.util.Random;

public class Bullet {
	static int health;
	static int damage;
	static int speed;
	int x, y; 
		
		public Bullet() {
			Random r = new Random(); 
			health = 200;
			damage = -100;
			speed = 1000; 
			x = r.nextInt(0, 4);
			y = 9;
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
		
		public int getX() {
		return x;	
		}
		
		public int getY() { 
			return y;
		}
		
		/**
		 * Method for hitting zombies
		 **/
		public void shootZombie(Zombie[] zombies, Peashooter[] peashooters, PotatoMine[] potatomines, Wallnut[] wallnuts) {
			boolean t = false;
			
			for(int i = 0; i < zombies.length; i++) {
				if(zombies[i].getX() == x && zombies[i].getY() == y) {
					if(zombies[i].getHealth() > 0) {
						zombies[i].setHealth(damage);
						
					}else { 
				}
				
				
			}
			
		
			for (int i = 0; i < peashooters.length; i++) {
				if (peashooters[i].getX() == x && peashooters[i].getY() == y) { //checking peashooters array with same x and y
					if (peashooters[i].getHealth() > 0) {
						peashooters[i].setHealth(damage);
					} else {
						peashooters[i].setY(10);
					}
					t = true;
					//System.out.println("Eating peashooter");
				}
			}

			for (int i = 0; i < potatomines.length; i++) { //checking potatomines array with same x and y
				if (potatomines[i].getX() == x && potatomines[i].getY() == y) {
					if (potatomines[i].getHealth() > 0) {
						potatomines[i].setHealth(damage);
					} else
						potatomines[i].setY(10);
					t = true;
					//System.out.println("Eating potatomines");
				}
			}
			for (int i = 0; i < wallnuts.length; i++) { //checking wallnuts array with same x and y
				if (wallnuts[i].getX() == x && wallnuts[i].getY() == y) {
					if (wallnuts[i].getHealth() > 0) {
						wallnuts[i].setHealth(damage);
					} else {
						wallnuts[i].setY(10);
					}
					t = true;
					//System.out.println("Eating wallnuts");
				}
			}

			if (!t && y >= 1) {
				// System.out.println("move");
				y++;
			}
		}
}
