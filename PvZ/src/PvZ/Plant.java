package PvZ;

public abstract class Plant {
	int health;
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
		health += hp;
	}

	public int getHealth() {
		return health;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}
}
