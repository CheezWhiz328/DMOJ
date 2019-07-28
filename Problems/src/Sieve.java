import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sieve {
	static void findprime(int m, int n) {
		if (m == 1) {
			m++;
		}

		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++) {
			prime[i] = true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (prime[i]) {
				for (int j = i * i; j <= n; j += i) {
					prime[j] = false;
				}
			}
		}
		
		System.out.println(0);
		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = in.readLine().split(" ");
		int c = Integer.parseInt(tmp[0]);
		findprime(0, c);

	}

}
