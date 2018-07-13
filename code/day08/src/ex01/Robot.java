package ex01;

public class Robot {
	private Move move;
	private Attack attack;
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	public void setMove(Move move) {
		this.move = move;
	}
	public void move() {
		move.move();
	}
	public void attack() {
		attack.attack();
	}
	public void fight() {
		move();
		attack();
		move();
	}
}
