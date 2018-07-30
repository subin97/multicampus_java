package AlgorithmClass.alist.array;

import java.util.Scanner;

public class 과제 {
	static int N = 10;
	static char[] s = new char[N];
	static int size = 0;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i = 0;i<N;i++) {
			char temp = sc.nextLine().charAt(0);
			size = i;	// size: 현재 값이 입력된 index의 최대값
			insert(temp);
			System.out.println(s);
		}
		System.out.println(findP());
		// P를 찾는 함수 호출
	}
	private static int findP() {
		// TODO Auto-generated method stub
		for(int i=0;i<=N;i++) {
			if(s[i]=='P') {
				return i;	// P가 포함된 index를 리턴
			}
		}
		return -1;	// P가 포함되어 있지 않으면 -1 리턴
	}
	public static void insert(char temp) {
		int tempIndex=0;
		char temp1;
		if(size==0) s[size]=temp;	// 초기값 설정
		else {
			for(int i=0;i<=size;i++) {
				if(s[i]>temp) {
					tempIndex=i;	// tempIndex에 temp의 위치 저장
					break;	// 반복문 탈출
				}
				else tempIndex=i;
			}
			for(int i=size-1;i>=tempIndex;i--) {
				temp1=s[i];
				s[i]=s[i+1];
				s[i+1]=temp1;
				// tempIndex이후의 값들을 한 칸씩 뒤로 미룸
			}
			s[tempIndex]=temp;	//tempIndex에 temp값 저장
		}
		size++;	// size를 1 증가시킴
	}
}
