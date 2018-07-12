package ex04;

public class Mazinga extends Robot{
	private MissileAttack attack;
	// Attack attack - 부모 클래스 이용 : 타입 의존성을 느슨하게 만듬
	private WalkingMove move;
	public Mazinga() {
		attack=new MissileAttack();
		move=new WalkingMove();
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
