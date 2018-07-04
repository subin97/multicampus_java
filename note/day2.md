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
  ~~~
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
~~~
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
