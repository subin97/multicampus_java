# Day 6
***
### MVC architecture
- M(Model)
  - DataBase Management System (DB를 효율적으로 관리)
  - Oracle : 많이 사용되는 DBMS중 하나
  -> DBA, Database Administrator
- V(View)
  - 사용자와의 상호작용을 하는 영역
  - HTML(HyperText Markup Language), CSS, Javascript(동적 효과)
  -> 웹 퍼블리셔, 프론트엔드 개발자
  - 사용자가 브라우저를 통해 접속
- C(Controller)
  - 기능 구현, 중간 관리자 역할
  - JAVA 등의 프로그래밍 언어로 구현
  - 서버 제공
  -> 백엔드, 웹 개발자

### 상속
> 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것

- 코드의 재사용성을 높임
- 코드의 중복 제거 -> 프로그램의 생산성과 유지보수에 크게 기여

~~~JAVA
class Employee extends Person {
  // Employee 클래스가 Person 클래스를 상속받음
  // Employee는 Person의 멤버 변수와 함수를 가진다.
  // Person : 부모클래스(super)
  // Employee : 자식클래스(sub)
}
~~~
- 상속된 클래스가 객체화될 때는 부모클래스가 먼저 객체를 만들고 자식클래스의 객체가 생성됨
- 이 때 부모클래스의 기본생성자가 호출됨
- 자식클래스의 모든 생성자의 첫 줄에는 부모클래스의 기본 생성자를 호출하는 코드가 포함되어 있음

### 포함관계 vs. 상속관계
- day05의 Circle, Point는 포함관계 : has a 관계
- 상속관계 : is a 관계

### Overriding
> 부모클래스가 정의한 멤버변수, 멤버함수를 자식클래스에서 재정의하는 것

~~~JAVA
class Parent{
	int data=100;
	public void print() {
		System.out.println("Parent의 data: "+data);  //100
	}
}
class Child extends Parent {
	int data=200;
	public void print() {
		int data=300;
		System.out.println("Child의 data: "+data);		
    // 300
    // 가장 가까운 멤버변수 참조
		System.out.println("this.data: "+this.data);
    // 200
    // this : 해당 클래스(객체) 명시적 호출
		System.out.println("super.data: "+super.data);
    // 100
    // super : 부모 클래스 명시적 호출
	}
}
public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		//c.data = 10;
		c.print();
	}
}
~~~
- 자식클래스가 객체화될 때는 부모클래스의 기본생성자를 묵시적으로 호출한다.
- 부모클래스가 기본생성자가 없다면 자식클래스의 생성자 첫 줄에서 부모클래스의 생성자를 명시적으로 호출해주어야 한다.

### 접근 지정자 protected
> 부모클래스가 protected으로 선언한 멤버함수나 멤버변수는 자식클래스가 접근할 수 있다. 자식클래스가 아닌 다른 클래스는 접근할 수 없다.

- public 보다는 좁고 private 보다는 넓은 범위.

### final 키워드
- 변수에 붙은 final은 값 변경 불가
- 함수에 붙은 final은 override 불가

### package
> class들의 집합

- 하나의 폴더 안에 같은 이름의 파일이 두 개 있을 수 없듯, 하나의 패키지에 같은 이름의 클래스가 두 개 이상 존재할 수 없다.
- project > package > class
- 이클립스에서는 파일시스템과 같은 구조를 추구함.
  - package는 폴더의 역할, class는 파일의 역할
  - 가능하면 .java 파일 당 class 하나를 쓰는 것이 좋다.
- 패키지의 이름
  - 도메인의 역순으로 작성
  - ex) com.company.test : company.com의 test라는 프로젝트를 의미

### Wrapper 클래스
> 기초 자료형을 객체로 포장시켜주는 클래스

### StringTokenizer 클래스
> 문자열을 분석해서 토큰으로 분리시켜 주는 기능을 제공

### 예제- /code/day06/bank
1. 계좌 생성
  - 계좌번호를 입력하세요: [사용자 입력]
  - 이름을 입력하세요: [사용자 입력]
  - "계좌 생성이 완료되었습니다" 출력
2. 입금
  - 계좌번호를 입력하세요: [사용자 입력]
  - 금액을 입력하세요: [사용자 입력]
  - "성공적으로 입금되었습니다." 혹은 "계좌번호가 존재하지 않습니다."
3. 출금
  - 2의 경우 + 잔액부족
4. 이체
  - 출금 계좌 입력
  - 입금 계좌 입력
  - 금액 입력
  - 성공/잔액부족/존재하지 않는 계좌
5. 전체 계좌 출력
0. 종료
