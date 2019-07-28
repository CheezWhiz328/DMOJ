import java.util.Scanner;

public class ThanosKnowsTheMost {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c = new int[a];
		for (int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < a; i++) {
			if (c[i] == 1 && i==0 || c[i] == 1 && c[i - 1] == 0 && i != 0) {

				count++;
			} else {
			}
			
		}System.out.println(count);
	}
}
