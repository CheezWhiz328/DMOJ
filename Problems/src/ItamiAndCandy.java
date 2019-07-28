import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItamiAndCandy {
	static int count = 0;

	static void findprime(int n, int x) {

		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			prime[i] = true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (prime[i]) {
				for (int j = i * i; j <= n; j += i) {
					prime[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				if(n-i>=0) {
				count += (n-i)/x+1;
				}
				if(n-i-1>=0) {
				count += (n-i-1)/x+1;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = in.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int x = Integer.parseInt(tmp[1]);
		findprime(N, x);

	}

}
