import java.util.Scanner;
// 백준 2476
public class Dice {
	static int dice[] = new int[3];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stage = Integer.parseInt(sc.nextLine());
		int[] result = new int[stage];
		for(int i=0;i<stage;i++) {
			for(int j=0;j<3;j++) {
				dice[j]=sc.nextInt();
			}
			result[i]=dicePrice(dice);
		}
		for(int i=0;i<stage;i++)
			System.out.println(result[i]);
	}
	public static int dicePrice(int[] dice) {
		int price=0;
		int count=0;
		int num=0;

		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				if(dice[i]==dice[j]) {
					count++;
					num=dice[i];
				}
			}
		}
		System.out.println("count: "+count);
		if(count==3)
			price=10000+num*1000;
		else if(count==2||count==1)
			price=1000+num*100;
		else {
			for(int i=0;i<3;i++) {
				if(num<dice[i])
					num=dice[i];
			}
			price=num*100;
		}
		return price;
	}
}
