package day05;

public class CircleTest {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		Circle c = new Circle();
		c.setRadius(10);
		c.setCenter(p);

		System.out.println(p);
		System.out.println(c);
		System.out.println("------------------");
		p.setX(10);
		p.setY(20);
		System.out.println(p);
		System.out.println(c);
    // 10, 20 대신 2, 3으로 나오게 setCenter() 함수 수정
	}
}
