import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticSnowmen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int count = 0;
		for (int i = 2; i < N; i++) {
			if (a[i] - a[i-1] == a[i-1] - a[i-2] && a[i-1] * 3 > count) {
				count = a[i] * 3;
			}

		}
		System.out.println(count);

	}
}
