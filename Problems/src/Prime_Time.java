import java.util.Scanner;

public class Prime_Time {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		for (int hi = 0; hi < 5; hi++) {
			int n = sc.nextInt();
			int[] fac = new int[10000];
				while (n % 2 == 0) {
					fac[1]++;
					n /= 2;
				}

				for (int i = 3; i <= Math.sqrt(n); i += 2) {

					while (n % i == 0) {
						fac[i - 1]++;
						n /= i;
					}
				}

				boolean prime = true;
				if (n % 2 == 0) {
					prime = false;
				} else {
					for (int j = 3; j <= Math.sqrt(n); j += 2) {
						if (n % j == 0) {
							prime = false;
							break;
						}
					}

				}

				if (prime) {
					fac[n - 1]++;
				}

			for (int j = 1; j < 10000; j ++) {
				if (fac[j] > 0) {
					System.out.print(j + 1 + "^" + fac[j] + " * ");
				}
			}

		}

	}
}