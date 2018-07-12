package ex04;

public abstract class Robot {
	public abstract void attack();
	public abstract void move();
	public void fight() {
		move();
		attack();
		move();
	}
}
