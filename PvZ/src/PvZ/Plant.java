package PvZ;

public abstract class Plant {
	static int health;
	int x, y;

	public Plant(int x, int y, int hp) {
		this.x = x;
		this.y = y;
		health = hp;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public void setHealth(int hp) {
		health+=hp;
	}
}
