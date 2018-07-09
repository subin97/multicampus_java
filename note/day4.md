# Day 4
***
### 배열 예제
- 랜덤한 로또번호 중복없이 뽑기
~~~java
public class Lotto {
	public static void main(String[] args) {
		// 1~45 사이의 랜덤한 숫자를 하나 뽑는다.
		// 0번째 배열에 저장
		// 1~45사이에 랜덤한 숫자를 하나 뽑는다.
		// 0번째 값과 비교해서 같은 값이면 다시 뽑는다.
		// 다른 값이면 1번째 배열에 저장
		// 반복
		int[] lottoNum=new int[6];

		for(int i=0;i<6;i++) {
			boolean flag=false;
			int num=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lottoNum[j]==num)
					flag=true;
			}
			if(flag==false)
				lottoNum[i]=num;
			else
				i--;
		}
		System.out.print("로또 번호 출력: ");
		for(int i=0;i<6;i++)
			System.out.print(lottoNum[i]+" ");
	}
}
~~~    

### 객체 지향 프로그래밍
- 절차 지향 : 구조체와 함수가 별도로 존재
  - Fortran, Cobol, C
- 객체 지향 : 관련있는 변수와 함수가 하나로 묶임
  - C++, Java

### Class와 Instance
- Class
  - 관련있는 변수(필드, 멤버 변수)와 함수(메서드, 멤버 함수)를 묶어 놓은 사용자 정의 자료형
  - 사용자가 정의한 '틀'
- Instance
  - 메모리가 직접 할당됨
  - 실제로 생성된 객체
  - '틀(class)'로 찍어낸 무언가

### 객체의 구성요소
- 속성(property) : 멤버변수(member variable), 특성(attribute), 필드(field), 상태(state)
- 기능(function) : 메서드(method), 함수(function), 행위(behavior)

### return값과 parameter
- 형식: [반환타입] function(parameter);
- return 값
  - 반환값이 없는 경우: void
  - 함수를 호출했을 때의 출력값의 자료형
- parameter
  - 함수를 호출했을 때의 입력되어야 하는 값

### private과 public
> 접근 지정자, 접근 지정 수식어

- public(default) : 같은 패키지 내에서 접근 가능
  - 앞에 아무 수식어가 없으면 public이다.
- private : 같은 클래스 내에서만 접근 가능
  - 일반적으로 상태는 객체 내부에서만 조작 가능하도록 private으로 설정한다.


### 중복 메소드(메소드 오버로딩)
> 한 클래스 내에서 반환값과 이름은 같지만 매개변수가 다른 여러개의 메소드를 정의하는 것

- Overloading의 조건 : 다음의 조건을 모두 만족해야 한다.
  1. 메서드 이름이 같아야 한다.
  2. 매개변수의 개수 또는 타입이 달라야 한다.
  ~~~java
  class Car{
  	public int speed;
  	public int mileage;
  	public String color;

  	public void speedUp() {
  		speed+=10;
  	}
  	public void speedDown() {
  		speed-=10;
  	}
    public String toString() {
      // overrides java.lang.Object.toString
      return "속도: "+speed+"  주행거리: "+mileage+"  색상: "+color;
    }
  }
  public class CarTest {
  	public static void main(String[] args) {
  		Car myCar=new Car();
  		Car yourCar=new Car();
  		myCar.speed=60;
  		myCar.mileage=0;
  		myCar.color="blue";
  		myCar.speedUp();
  		System.out.println(myCar);

  		yourCar.mileage=10;
  		yourCar.speed=120;
  		yourCar.color="white";
  		yourCar.speedDown();
  		System.out.println(yourCar);
  		// println에 객체를 호출할 경우 overrides된 toString함수를 호출해옴
  	}
  }
  ~~~

### 설정자와 접근자
> 멤버 변수는 기본적으로 다른 class에서 접근하지 못하게 private으로 정의된다. 이 때 인스턴스의 필드에 접근하기 위해 설정자와 접근자라는 멤버함수를 사용한다.

* 설정자와 접근자 사용 이유
   * 상태값을 은닉화 -> 객체지향원칙
   * 입력값에 대한 검증 가능
   * 접근권한 세분화(Getter: read, Setter: write)

1. 설정자(Setter)   
  - 반환 유형은 void
  - 매개변수로 되고자 하는 필드의 타입과 같은 값을 받음
  - 필드=매개변수로 몸통 구현
  - 이름은 setXXX(ex: setSpeed)
2. 접근자(Getter)
  - 반환 유형이 내가 getter가 되고자 하는 필드의 타입
  - 이름은 getXXX(ex: getSpeed)
~~~java
  class Car{
	   private int mileage;    // private 멤버 변수

	   public int getMileage() {
		      return mileage;
	   }   
     // 멤버함수의 값을 반환
	   public void setMileage(int mileage) {
		     this.mileage=mileage;
         // this : 클래스의 주소를 뜻함
         // 매개변수와 멤버변수의 이름이 같을 때
         // this.mileage는 클래스의 멤버변수를 뜻함
	   }  
     // 멤버함수의 값을 설정
}
~~~

### this
> 객체, 자기 자신을 의미

- this는 주로 이럴 때 사용한다!
  1. 클래스의 속성과 생성자/메서드의 매개변수의 이름이 같을 때(위의 예시의 경우)
  2. 클래스에 오버로딩된 다른 생성자 호출

  ~~~java
  public class Fruit {
  	private String name;
  	private String color;
  	private double weight;
  	private int count;

  	public Fruit(String name, String color) {
  //		Fruit(String name, String color, double weight, int count) 을 호출
  		this(name, color, 0.0,0);
  	}
  	public Fruit(String name, String color, double weight, int count) {
  		// 생성자 오버로딩
  		this.name=name;
  		this.color=color;
  		this.weight=weight;
  		this.count=count;
  	}
  }
  ~~~
  3. 객체 자신의 참조하고 싶을 때

  ~~~java
  public class Fruit {
  	private String name;
  	private String color;
  	private double weight;
  	private int count;

  	public Fruit(String name, String color, double weight, int count) {
  		// 생성자 오버로딩
  		this.name=name;
  		this.color=color;
  		this.weight=weight;
  		this.count=count;
  	}
  	public Fruit getFruitInstance() {
  		return this;
  	}
  	// Fruit의 주소 return
  }
  ~~~

### getter, setter 예제
> 이름, 연봉, 직급을 저장할 수 있고 각 필드에 대해 getter setter method 정의 /
그리고 전체 객체의 상태값을 한 눈에 파악할 수 있는 적절한 toString method를 정의

~~~java
// Employee.java
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
~~~
~~~java
// EmployeeTest.java
public class EmployeeTest {
	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setName("최수빈");
		ee.setSalary(7000);
		ee.setPosition("부장");

		System.out.println(ee);
	}
}

~~~
