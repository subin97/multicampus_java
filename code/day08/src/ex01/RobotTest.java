package ex01;

public class RobotTest {
	public static void main(String[] args) {
		PunchAttack pa=new PunchAttack();
		MissileAttack ma= new MissileAttack();
		WalkingMove wm=new WalkingMove();
		FlyingMove fm=new FlyingMove();
		
		Robot taekwon=new Robot();
		taekwon.setAttack(pa);
		taekwon.setMove(fm);
		
		Robot mazinga=new Robot();
		mazinga.setAttack(ma);
		mazinga.setMove(wm);
		
		Robot sunguard=new Robot();
		sunguard.setAttack(pa);
		sunguard.setMove(wm);
		
		Robot humanoid=new Robot();
		humanoid.setAttack(ma);
		humanoid.setMove(fm);
		
		taekwon.fight();
		mazinga.fight();
		sunguard.fight();
		humanoid.fight();
	}
}
