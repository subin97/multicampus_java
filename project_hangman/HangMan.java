import java.util.Arrays;
import java.util.Scanner;

public class HangMan {
	static String[] words = new String[] {
				"apple", "banana", "cat", "rectangle", "cherry", "database"
				};
	static int size = 6; // words크기
	static boolean[] isCharAt;

	public static int randomWords() {
		int randIndex = (int) (Math.random() * size);
		return randIndex;
	}

	private static void match(String str, char c) {
		// str에 c라는 문자가 있는지 확인
		int len = str.length();
		isCharAt = new boolean[len];
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == c) {
				isCharAt[i] = true;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 10; // count 시도횟수
		String answer = words[randomWords()];

		char[] c = new char[answer.length()]; // 사용자가 맞춘 알파벳 저장하는 배열
		Arrays.fill(c, '_'); // c 초기화
		while (count > 0) {
			System.out.print("알파벳을 입력하세요오: ");
			String temp = sc.nextLine();
			match(answer, temp.charAt(0));
			for (int i = 0; i < answer.length(); i++) {
				if (isCharAt[i] == true) {
					c[i] = temp.charAt(0);
				}
				System.out.print(c[i] + " ");
			}
			System.out.println();
			count--;
			// 다맞추면 return;
			int helll=0;
			for(int i=0;i<answer.length();i++) {
				if(c[i]!='_') helll++;
			}
			if (helll==answer.length()) {
				System.out.println("정답입니당");
				return;
			}
		}
		System.out.println("Game Over");
	}
}
