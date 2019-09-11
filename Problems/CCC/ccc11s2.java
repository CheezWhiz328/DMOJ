import java.util.Scanner;

public class ccc11s2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		char[] correct = new char[N];

		for (int i = 0; i < N; i++) {
			correct[i] = sc.next().charAt(0);

		}

		int counter = 0;
		for (int i = 0; i < N; i++) {
			char response = sc.next().charAt(0);
			if (response == correct[i]) {
				counter++;

			}
		}

		System.out.println(counter);

	}
}
