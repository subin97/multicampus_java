package day04;
// 이름 연봉 직급을 저장할 수 있고 각 필드에 대해 getter setter method
// 그리고 전체 객체의 상태값을 한 눈에 파악할 수 있는 적절한 toString method를 정의

public class Employee {
	private String name;
	private int salary;
	private String position;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int sal) {
		salary=sal;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}

	@Override
	public String toString() {
		return "이름: "+name+"   연봉: "+salary+"  직급: "+position;
	}
}
