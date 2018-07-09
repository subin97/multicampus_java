# Day2
---

### Cloud Computing
- 컴퓨터 통신망이 구름과 같은 것에 싸여 안이 보이지 않고, 일반 사용자는 이 복잡한 내부를 굳이 알 필요도 없이 어디에서나 구름 속으로 손을 집어넣어 자기가 원하는 작업을 할 수 있다는 것

- 온라인에 분산되어 존재하는 데이터 센터(Data Center, 이하 클라우드)에 맡겨 수행하고, 사용자의 컴퓨터는 클라우드에 접속하여 상호작용하는 단말기 역할만 함

- 웹 서비스의 경우 개인이 AWS, MS Azure, Google Cloud Platform 등 대기업의 클라우드 자원을 빌려 서버를 편리하게 운영 가능


### Encoding / Decoding
- 인코딩
  - 정보의 형태나 형식을 변환하는 처리나 처리 방식
  - 영상, 음성 등의 압축 방식 혹은 문자의 부호(code)화를 포함함
- 디코딩
  - 부호화(encoding)된 정보를 부호(code)화되기 전으로 되돌리는 처리 혹은 그 처리 방식


### 형변환
- 데이터 타입이 변하는 것
- 묵시적 형변환
  - 작은 타입의 데이터와 큰 타입의 데이터 사이의 연산이 일어날 때, 작은 타입의 데이터를 큰 타입으로 자동변환시킴
- 명시적 형변환
  - 큰 타입의 데이터를 작은 타입의 변수에 담기 위해서는 강제로 작은 타입으로 형변환해주어야 함(데이터 손실)
  ~~~java
  public class ArithmeticOper {
  	public static void main(String[] args) {
  		// 계산 결과가 정수인 값을 저장할 변수
  		int result;
  		// 계산 결과가 실수인 값을 저장할 변수
  		double resultDouble;

  		resultDouble=3;
  		System.out.println(resultDouble);	//3.0
  		// 암묵적 형변환

  		result=(int) 3.5;
  		// 명시적 형변환
  		System.out.println(result);	//3
  	}
  }
  ~~~

### 연산자
- 단항연산자
~~~java
public class ArithmeticOper {
	public static void main(String[] args) {
		int x=0;
		int z;
		z=x++;
		// z=x;
		// x=x+1;
		System.out.println("x: "+x);    // 1
		System.out.println("z: "+z);    // 0
		System.out.println();
		z=++x;
		// x=x+1;
		// z=x;
		System.out.println("x: "+x);  // 2
		System.out.println("z: "+z);  // 2
	}
}
~~~  

### Error
- Compile Error
  - 제일 쉽게 발견
  - 어디서 오류가 났는지 확인 가능
- Runtime Error
  - 실행했을 때 발견
  - 다양한 테스트 시나리오를 통해 해결 가능
- 논리 에러
  - 제일 발견되기 어려움 (반응 X)

### 암호화 / 복호화
- 나만 알고 남들은 모르게 섞어놓는 기술
- 키(key)를 모르면 암호를 알 수 없음

  1. 전사 공격
    - 키가 될 수 있는 모든 가능한 후보들을 시도해보는 것
  2. AES(Advanced Encryption Standard)
    - 키와 원문을 섞는 방법
    - 암호화와 복호화 과정에서 동일한 키를 사용하는 대칭 키 알고리즘
  3. 공개키 암호화 알고리즘(비대칭 암호)
    - 공개키와 비밀키가 존재
    - 공개키는 누구나 알 수 있음, 비밀키는 소유자만 알 수 있음
    - ex) RSA : 최초의 전자서명 알고리즘

### 실습예제
1. 사용자로부터 연도를 입력받아서 윤년여부를 판단 후 출력하는 프로그램을 작성하여라. 4로 나누어 떨어지면서 100으로 나누어 떨어지지 않는 경우, 혹은 400의 공배수인 경우 윤년이다.
~~~java
public class Examples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("연도 : ");
		int year=sc.nextInt();
		boolean lunarYear=year%400==0?
				true:year%4==0&&year%100!=0?
						true:false;
		System.out.println(year+"년은 윤년입니까? "+lunarYear);
	}
}
~~~

2. 사용자로부터 상품 금액을 입력받아서 큰 단위부터 각각 만원 오천원 천원 오백원 백원 십원이 몇 개씩 필요한지 출력하여라
~~~java
public class Examples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("상품 금액 : ");
		int money=sc.nextInt();
		int man=money>=10000?money/10000:0;
		money-=man*10000;
		int ochun=money>=5000?money/5000:0;
		money-=ochun*5000;
		int chun=money>=1000?money/1000:0;
		money-=chun*1000;
		int obaek=money>=500?money/500:0;
		money-=obaek*500;
		int baek=money>=100?money/100:0;
		money-=baek*100;
		int sip=money>=10?money/10:0;
		money-=sip*10;
		System.out.println("만원 : "+man);
		System.out.println("오천원 : "+ochun);
		System.out.println("천원 : "+chun);

		System.out.println("오백원 : "+obaek);
		System.out.println("백원 : "+baek);
		System.out.println("십원 : "+sip);
	}
}
~~~

3. 사용자로부터 세 개의 숫자를 입력받아서 가장 큰 수를 출력하는 프로그램을 작성하시오.
~~~java
public class Examples {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("세 개의 숫자를 입력하시오. : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();

		int max=num1>num2?
				num1>num3?num1:num3
				:num2>num3?num2:num3;
		System.out.println("최댓값: "+max);
	}
}
~~~
4. 사용자로부터 세 개의 숫자를 입력받아 중간 크기의 숫자를 출력하는 프로그램을 작성하여라.
~~~java
public class Examples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개의 숫자를 입력하시오. : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

    // max: 세 수 중 최댓값
		int max = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;
    // mid: max를 제외한 두 수 중 최댓값
    int mid = num1==max? num2>num3? num2:num3
				:num2==max? num1>num3? num1:num3
						:num1>num2? num1:num2;

		System.out.println("중간값: " + mid);
	}
}
~~~
