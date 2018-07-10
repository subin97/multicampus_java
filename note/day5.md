# Day5
***
### source 자동생성
> source -> generate getter&setter : 해당 변수 체크하면 getter setter 자동 생성됌   

### 생성자
> 객체가 생성될 때에 호출되어 초기화 절차를 실행하는 메서드

- 접근지정자가 일반적으로 public
- 반환 유형 자체가 없음.(void 아님)
- 함수명이 클래스 이름과 같음
- 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재할 수 있다.

~~~java
// Car.java
public class Car {
	private int speed;
	private int mileage;
	private String color;

    // 매개변수 없는 생성자 : default 생성자(기본 생성자)
    // 생성자를 하나도 만들지 않았을 때 자동으로 생성됨(초기값으로 초기화)
      public Car() {
      speed=0;
      mileage=0;
      color="Red";
    }
    public Car(int s, int m, String c) {
      speed=s;
      mileage=m;
      color=c;
    }
    public Car(String c) {
      this(0,0,c);
    }
}
~~~
~~~java
// CarTest.java
public class CarTest {
	public static void main(String[] args) {
		Car oppaCha=new Car();
    // 인스턴스 생성할 때 생성자 호출
	}
}
~~~

### 가변 길이 인자(Variable argument)
> 몇 개의 인자가 넘어올지 모를 때 사용, 배열로 간주됨. 메소드가 호출될 때 배열의 길이를 결정

~~~java
public int sum(int ... numbers){
  // ... : 가변 길이 인자
  int sum = 0;
  for(int n : numbers)
    sum += n;
  return sum;
}
~~~

### Hash 함수
> [해시함수 위키백과](https://ko.wikipedia.org/wiki/%ED%95%B4%EC%8B%9C_%ED%95%A8%EC%88%98)

- input 개수 무한대, output 개수 일정
- output을 보고 input값을 유추할 수 없음
- 패스워드, 블록체인 등에 사용된다.
- MD5 (Message-Digest Algorithm 5)
  - 메세지 축약 알고리즘으로써, 파일 무결성 검사용도로 많이 쓰이고 있다.
  - 128bit 의 해쉬를 제공하며, 암호와와 복호화를 통하여 보안용도로도 많이 쓰인다.
- SHA-256 (Sechre Hash Standard)
  - 160bit의 해시 제공

~~~java
// MD5 사용 코드 - MessageDigest 클래스 사용
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Test {
	public static void main(String[] args) {
		String str ="Subin";
		String MD5 = "";
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte byteData[] = md.digest();
			StringBuffer sb = new StringBuffer();
			for(int i = 0 ; i < byteData.length ; i++){
				sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
			}
			MD5 = sb.toString();

		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
			MD5 = null;
		}
		System.out.println(MD5);
	}
}
~~~

### 정적변수(클래스 변수, static variable)
> 모든 객체를 통틀어서 하나만 있는 변수. 다른 인스턴스가 같은 변수에 접근함.

- cf) 인스턴스 변수 : 객체마다 하나씩 있는 변수
- 모든 객체가 공유해서 접근할 수 있는 변수 공간

~~~java
// Car.java
public class Car {
	private int speed;
	private int mileage;
	private String color;
	public static int numberOfCars;
}
~~~
~~~java
// Cartest.java
public class CarTest {
	public static void main(String[] args) {
		Car oppaCha=new Car();
		System.out.println(Car.numberOfCars);
    // 클래스 변수 -> 클래스 객체로 접근
		Car appaCha=new Car(50, 1200,"white");
		System.out.println(Car.numberOfCars);
    // oppaCha.numberOfCars=appaCha.numberOfCars=Car.numberOfCars
		System.out.println(oppaCha);
		System.out.println(appaCha);
	}
}
~~~

### 정적 메소드(static method)
> 객체의 상태값과 상관없는 동작을 하는 메소드를 구현할 때 사용. 객체를 생성하지 않고 사용할 수 있음.

- ex) 수학과 관련된 메소드들

~~~java
double value = Math.sqrt(9.0);
~~~

### 상수
> static 키워드가 붙은 변수는 프로그램이 종료될 때까지 사라지지 않는다.

~~~java
static final int MAX_SPEED=350;
~~~

### 예제- 복소수 연산
> [자바에서의 실수 연산 오류](http://gwpark.tistory.com/1729)

-> BigDecimal 사용하면 해결 가능
