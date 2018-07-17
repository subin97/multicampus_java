# Day 10
***
### Generics(p.670)
> 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능  
C++ 에서의 template과 비슷한 기능을 함

- 지네릭스의 장점
  1. 타입 안정성을 제공한다.
  2. 타입 체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.

~~~java
class Box<T>{
	T data;
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}
~~~
~~~java
public class BoxTest {
  public static void main(String[] args) {
      Box<String> b = new Box<String>();
      b.setData("???");
      String s = b.getData();
      System.out.println(s);
      System.out.println(s instanceof String);
  }
}
~~~

### 컬렉션 프레임웍(Collections Framework)
> 데이터 군을 저장하는 클래스들을 표준화한 설계  
Collection : 다수의 데이터, 즉 데이터 그룹
Framework : 표준화된 프로그래밍 방식


1. List
  - 순서가 있는 데이터의 집합
  - 데이터의 중복 허용
2. Set
  - 순서를 유지하지 않는 데이터의 집합.  
  - 데이터의 중복을 허용하지 않음.  
  - 내가 넣은 순서와 상관없이 저장됨
3. Map
  - key와 value의 쌍으로 이루어진 데이터의 집합
  -  순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.

### ArrayList
- Object 배열을 이용해서 데이터를 순차적으로 저장.  
배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성해서 기존의 배열에 저장된 내용을 새로운 배열로 복사한 다음에 저장.
- 데이터를 순차적으로 추가/삭제 하는 데 효율이 좋다.

### LinkedList
- 중간 데이터를 추가/삭제하는 경우 ArrayList보다 빠르다.
- LinkedList 클래스가 구현되어있음 : double LinkedList로 구현되어 있음

### Stack, Queue
1. Stack : LIFO(Last In First Out)  
  - 자바에서는 Stack 클래스로 구현하여 제공하고 있음
  - 함수 호출, 지역변수 등
  - 활용 예) 수식 계산, 수식괄호검사, 웹브라우저의 뒤로/앞으로
2. Queue : FIFO(First In First Out)
  - Queue 인터페이스로 지정, 별도의 클래스 제공 X
  - 활용 예) 최근사용문서, 인쇄작업 대기목록, buffer

### Iterator(반복자)
> 컬렉션에 저장된 요소를 접근하는 데 사용되는 인터페이스 중 하나.  
객체 지향적 프로그래밍에서 배열이나 그와 유사한 자료 구조의 내부의 요소를 순회(traversing)하는 객체이다.

### HashMap
> 데이터 쌍을 저장

- 키(key) : 컬렉션 낸의 key중에서 유일해야 한다.
- 값(value) : key와 달리 데이터의 중복을 허용한다.

~~~java
import java.util.HashMap;
import java.util.Map;

public class MapTest{
	public static void main(String[] args) {
		Map<String, Student>
		st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001,"구준표"));
		st.put("20090002", new Student(20090002,"금잔디"));
		st.put("20090003", new Student(20090003,"윤지후"));

		// Map탐색 1 : Entry단위로 검색
		for(Map.Entry<String, Student> s : st.entrySet()) {
			s.getKey();
			s.getValue();
		}
		// Map에서 데이터 가져올 땐 키값으로 질의
		System.out.println(st.get("20090001"));

		// Map탐색 2 : Key로 접근
		for(String k : st.keySet())
			System.out.println(st.get(k));
	}
}
~~~


### Comparator와 Comparable
> 대소비교 가능  
 [자바 정렬 Comparable 확실히 알기](http://cwondev.tistory.com/15)

- implements Comparable하면 객체의 대소비교가 가능해진다.
- Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용

~~~java
class Account implements Comparable<Account>{
	private String id;
	private String name;
	private int balance;
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	@Override
	public int compareTo(Account o) {
	// balance기준으로 비교
  	if( this.balance > o.balance)
			return -1;
		else if( this.balance == o.balance)
			return 0;
		else
			return 1;
//		return this.id.compareTo(o.id);
	}

}


public class ComparableTest {
	public static void main(String[] args) {
//		String[] strArr = {"a", "c", "b"};
//		Arrays.sort(strArr);
//		for(String s : strArr)
//			System.out.println(s);
		Account[] accArr = new Account[3];
		accArr[0] = new Account("10112", "Hong",5000);
		accArr[1] = new Account("20132", "Kim",3000);
		accArr[2] = new Account("10012", "Lee",7000);
		Arrays.sort(accArr);
		for(Account a : accArr)
			System.out.println(a);
	}
}
~~~
