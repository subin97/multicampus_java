# Day 8
***
### 인터페이스
> 추상메소드의 집합

- extends 대신에 implements 키워드 사용
- 추상 클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가지지 않음
- 추상클래스를 '미완성 설계도'라고 한다면, 인터페이스는 '기본 설계도'
- 제약사항
  - 모든 멤버변수는 public static final이어야 하며, 이를 생략할 수 있다.
  - 모든 메서드는 public abstract이어야 하며, 이를 생략할 수 있다.
- 인터페이스의 장점
  1. 개발시간을 단축시킬 수 있다.
  2. 표준화가 가능하다.
  3. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
  4. 독립적인 프로그래밍이 가능하다.

### 내부클래스
> 클래스 내에서 선언된 클래스

- 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
- 코드의 복잡성을 줄일 수 있다.(캡슐화)
~~~java
public class OuterClass {
	private String secret = "Time is money";

	public OuterClass() {
		InnerClass obj=new InnerClass();
		obj.method();
	}
	private class InnerClass{
		public InnerClass() {
			System.out.println("내부 클래스 생성자입니다.");
		}
		public void method() {
			System.out.println(secret);  
      // InnerClass, secret 둘 다 OuterClass의 멤버이므로 접근 가능
		}
	}
}
~~~
~~~java
public class OuterClassTest {
	public static void main(String[] args) {
		new OuterClass();
	}
}
~~~
- 실행결과   
~~~
내부 클래스 생성자입니다.
Time is money
~~~

### 익명클래스
- 이름이 없는 클래스
- 클래스의 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있는 일회용 클래스이다.

### 예외 처리
- 예외(Exception) : 프로그램 실행 도중 문제가 생겨서 문제를 처리하지 않으면 프로그램이 종료됨.
  - ArrayIndexOutOfBoundException : 배열의 잘못된 인덱스에 참조
  - ClassCastException : 객체를 형변환할 때 잘못된 타입으로 형변환
  - NullPointerException : 참조값이 없는 참조변수에 .연산자를 통해 접근

~~~java
public class DivideByZero {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		try {
			int result = x / y;
			System.out.println("예외가 발생하면 바로 catch로");
			// 실행되지 않음
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램은 계속 진행됩니다.");
	}
}
~~~

### finally 블록
> 오류가 발생하였건 발생하지 않았건 항상 실행되어야 하는 코드

- return문 때문에 필요함!
- 자바에서는 예외도 객체로 처리함
- 예외를 만들기 위한 클래스도 상속계층구조를 가짐
- 부모타입 예외의 catch는 자식타입의 예외까지도 잡을 수 있음

### 예외의 종류
1. Error : 권한 밖, 예외처리 대상이 아님
  - ThreadDeath
  - OutOfMemoryError
  - AWTError
2. IOException(Checking Exception) : 필수적 예외처리 대상
  - 컴파일러가 검사
3. RuntimeException(Unchecking Exception) : 선택적 예외처리 대상
  - if 조건문에서 걸러지는 경우도 있음
