import java.util.Arrays;
import java.util.Scanner;

public class mwc15c1p1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			b[i] = c * 60 + d;
		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		int max = x * 60 + y;
		Arrays.sort(b);
		int total = 0;
		for (int i = 0; i < a; i++) {
			total += b[i];
			if (total > max) {
				System.out.println(i);
				System.exit(0);
			}
		}System.out.println(a);

	}
}
