# Day1
***
### Java 설치하기
1. JRE와 JDK
  - JRE
    - Java Runtime Environment
    - 자바로 작성된 응용프로그램이 실행되기 위한 최소환경
  - JDK
    - Java Development Kit
  - JDK는 JRE를 포함한다.

### 변수


### 출력
- System.out.println() : 개행문자 포함
- System.out.print() : 개행문자 포함X
- 단축키 : syso+ctrl+space

### 입력
- 사용자의 입력을 받을 때는 Scanner 이용

~~~
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

### 자료형
1. 기본형
  - 논리형(boolean)
  - 문자형(char)
  - 정수형(byte, short, int, long)
  - 실수형(float, double)

2. 참조형
  - 나머지 전부


### 예제
- 사용자로부터 원화를 입력받고 달러값으로 변환하여 출력하여라. 환율은 1118.70이다.

~~~
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
