import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationImprovement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] a = s.split("x");
		Long mult = (long) 1;
		int[] mul = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			mul[i] = Integer.parseInt(a[i]);
		}
		Arrays.sort(mul);
		for (int i = 0; i < a.length; i++) {
			mult *= mul[i];
			if (i == a.length - 1)
				System.out.print(mul[i]+"\n");
			else
				System.out.print(mul[i] + "x");
		}
		System.out.println(mult);

	}
}
