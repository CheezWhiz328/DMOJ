import java.util.Arrays;
import java.util.Scanner;

public class ccc16s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] b1 = new int[b];
		int[] b2 = new int[b];
		for (int i = 0; i < b; i++) {
			b1[i] = sc.nextInt();
		}

		for (int i = 0; i < b; i++) {
			b2[i] = sc.nextInt();
		}

		int count = 0;
		Arrays.sort(b1);
		Arrays.sort(b2);
		if (a == 1) {
			for (int i = 0; i < b; i++) {
				count += Math.max(b1[i], b2[i]);
			}
			System.out.println(count);
		} else {
			for (int i = 0; i < b; i++) {
				count += Math.max(b1[i], b2[b - i - 1]);
			}
			System.out.println(count);
		}

	}

}