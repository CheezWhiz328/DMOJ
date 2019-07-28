import java.util.Scanner;

public class collatz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		while (true) {
			if (N == 1) {
				System.out.println(count);
				System.exit(0);
			} else {
				if (N % 2 == 0) {
					N /= 2;
				} else {
					N = 3 * N + 1;
				}
				count++;
			}
		}
	}
}
