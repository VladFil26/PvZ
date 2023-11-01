/*
 * Oct - Nov 2023
 * Class for peashooter plant
 */
package PvZ;

public class Peashooter extends Plant {
	Bullet b;

	public Peashooter(int x, int y) {
		super(x, y, 200);
		b = new Bullet(x, y);
	}

}
