import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimesAgain {
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

		for (int i = m; i <= n; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = in.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		findprime(a,b);

	}

}
