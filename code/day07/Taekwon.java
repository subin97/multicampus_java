package ex04;

public class Taekwon extends Robot {
	private PunchAttack attack;
	private FlyingMove move;
	public Taekwon() {
		attack = new PunchAttack();
		move = new FlyingMove();
	}
	@Override
	public void attack() {
		attack.attack();
	}
	@Override
	public void move() {
		move.move();
	}
}
