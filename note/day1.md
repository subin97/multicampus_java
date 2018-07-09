# Day1
***

### Java 개요
1. Java 언어의 특징
  - 운영체제에 독립적이다.
    - JVM(Java Virtual Machine)은 운영체제에 종속적-> 운영 체제에 따라 서로 다른 버전의 JVM을 제공
    - JVM은 OS위에 존재하여 컴파일을 한 단계 거쳐야 함
    ->속도가 느려진다는 단점이 있으나 JIT 컴파일러등으로 최적화하여 단점 보완.
    - 따라서 자바로 작성된 프로그램은 운영체제와 하드웨어에 관계없이 실행가능함
  - 객체지향 언어이다.


2. JRE와 JDK
  - JRE
    - Java Runtime Environment
    - 자바로 작성된 응용프로그램이 실행되기 위한 최소환경
    - JVM+클래스 라이브러리(Java API)
  - JDK
    - Java Development Kit
    - JRE+개발에 필요한 실행파일

### Eclipse 단축키
- ctrl+shift+f : 자동 들여쓰기
- ctrl+space : 자동완성
- ctrl+/ : 주석

### 변수
- 선언 형식 : [변수 타입] [변수 이름];
- 변수의 타입
  1. 기본형 : stack에 저장, 정적 메모리 할당
    - 논리형(boolean)
    - 문자형(char)
    - 정수형(byte, short, int, long)
    - 실수형(float, double)
  2. 참조형 : heap에 저장, 동적 메모리 할당
    - 나머지 전부
    - 동적할당 : new 키워드 사용
      ~~~java
      Scanner scan=new Scanner(System.in);
      ~~~

### 출력
- System.out.println() : 개행문자 포함
- System.out.print() : 개행문자 포함X
- 단축키 : syso+ctrl+space

### 입력
- 사용자의 입력을 받을 때는 Scanner 이용

~~~java
import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 하나 입력하세요.");
		int num1=scan.nextInt();
		System.out.println("숫자를 하나 더 입력하세요.");
		int num2=scan.nextInt();
		int sum=num1+num2;
		System.out.println("당신이 입력한 두 수의 합은 "+sum+"입니다.");
	}
}
~~~




### 예제
- 사용자로부터 원화를 입력받고 달러값으로 변환하여 출력하여라. 환율은 1118.70이다.

~~~java
import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double RATE=1118.70;
		// 프로그램이 실행되는 동안 변하지 않는 값이라면 final 키워드 명시
		// 값 변경할 수 없음(C에서 const와 같음)
		// 심볼릭 상수는 변수명을 대문자로 표기
		System.out.println("원화의 금액을 입력하시오.");
		int won=sc.nextInt();
		double dollar=won/RATE;
		System.out.printf("환산한 금액은 %.2f 달러입니다.", dollar);
    // printf 쓰면 C언어와 같이 사용가능
	}
}
~~~
