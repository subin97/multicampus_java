package day05;

public class Circle {
	private int radius;
	private Point center;

	public Circle() {
		radius = 0;
		center = new Point();
	}
	public Circle(int radius, Point center) {
		this.radius = radius;
	  this.center = new Point(center.getX(), center.getY());
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
    // this.center=center; - 주소값만 복사하는 shallow copy
		this.center.setX(center.getX());
		this.center.setY(center.getY());
    // c.center를 p로 설정하는 대신
    // c.center의 x, y를 p의 x, y값으로 설정
    // 주소값 안의 실제 값을 복사하는 deep copy
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
}
