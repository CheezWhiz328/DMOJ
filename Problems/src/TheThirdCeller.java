import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheThirdCeller {
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

		int count = 0;
		for (int i = m; i < n; i++) {
			if (prime[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(in.readLine());
		for (int i = 0; i < a; i++) {
			String[] tmp = in.readLine().split(" ");
			int b = Integer.parseInt(tmp[0]);
			int c = Integer.parseInt(tmp[1]);
			findprime(b, c);
		}

	}

}
