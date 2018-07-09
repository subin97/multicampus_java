# Day3
---
### 예제풀이
- 예제4) 사용자로부터 세 개의 수를 입력받아 중간값을 구하여라.
- sol2) 세 수 중 두 수씩 묶어 최댓값 3개를 만든 다음, max1,2,3중 최솟값을 구한다.

~~~java
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		int n1,n2,n3;
		int max1, max2, max3;
		int mid;
		for(int i=0;i<6;i++) {
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();

		if(n1>n2) max1=n1;
		else max1=n2;
		if(n2>n3) max2=n2;
		else max2=n3;
		if(n3>n1) max3=n3;
		else max3=n1;

		if(max1>max2) {
			if(max2>max3)
				mid=max3;
			else mid=max2;
		}
		else {
			if(max1>max3) mid=max3;
			else mid=max1;
		}
		System.out.println(mid);
		}
	}
}
~~~

### Switch-case문
- 여러 개의 case를 작성할 경우 case 1: case 2: 와 같이 이어쓰면 가능
- 가위 바위 보 예제: 결과값을 빼서 가장 효율적으로 계산   

~~~java
import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요: ");
		Scanner sc= new Scanner(System.in);
		int user=sc.nextInt();
		int com=(int)(Math.random()*3)+1;

		System.out.println("당신은 "+user+"입니다.");
		System.out.println("컴퓨터는 "+com+"입니다.");
		switch (user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}
	}
}
~~~

### 조건문 예제
- if문
~~~java
public class Ex_if {
	public static void main(String[] args) {
		int num=(int)(Math.random()*10)+1;

		if (num <= 7) {
			if (num == 1)
				System.out.println("Bananas");
			if (num == 2)
				System.out.println("Oranges");
			if (num == 3)
				System.out.println("Pears");
			if (num == 3 || num == 4)
				System.out.println("Apples");
			if (num == 3 || num == 4 || num == 5)
				System.out.println("Plums");
			else if (num == 6)
				System.out.println("Pineapples");
		}
		else
			System.out.println("Nuts");

	}
}
~~~

- switch문
~~~java
public class Ex_switch {
	public static void main(String[] args) {
      int num=(int)(Math.random()*10)+1;

		switch(num) {
		case 1:
			System.out.println("Bananas");
			break;
		case 2:
			System.out.println("Oranges");
			break;
		case 3:
			System.out.println("Pears");
		case 4:
			System.out.println("Apples");
		case 5:
			System.out.println("Plums");
			break;
		case 6:
			System.out.println("Pineapples");
			break;
		case 7:
			break;
		default:
			System.out.println("Nuts");
		}

	}
}
~~~

### 유클리드 호제법
> 2개의 자연수 또는 정식의 최대공약수를 구하는 알고리즘의 하나이다. 호제법이란 말은 두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘을 나타낸다. 2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고, 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.

~~~java
import java.util.Scanner;

public class Euclidean {
	public static void main(String[] args) {
		int x, y;
		Scanner sc=new Scanner(System.in);
		System.out.print("큰 수: ");
		x=sc.nextInt();
		System.out.print("작은 수: ");
		y=sc.nextInt();
		while (y > 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		System.out.println("두 수의 최대 공약수는 " + x + "입니다.");

	}
}
~~~
