package day06;

public class Manager extends Employee{
	private int bonus;

	public int getSalary() {
		return salary+bonus;
	}
	private void setSalary(int salary) {
		super.salary=salary;
		// setSalary의 접근지정이 private이기 때문에 오류
		// super class의 setSalary가 protected이기 때문에
		// protected 혹은 public으로 설정해야 함.
	}
	public void setRRN(int rrn) {
		RRN=rrn;
		// 상속받은 멤버변수 RRN이 private 이기 때문에 오류
	}
}
