import java.util.Scanner;

public class StrChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = sc.nextLine();
		printStr(s, s.length()-1);
	}
	private static void printStr(String str, int i) {
		char c = str.charAt(i);
		System.out.print(c);
		if(i>0) printStr(str, i-1);
	}
}
