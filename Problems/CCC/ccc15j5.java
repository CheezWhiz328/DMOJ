import java.util.*;
import java.io.*;

public class ccc15j5 {
	static int MAX = 1 << 8;
	static int dp[][] = new int[MAX][MAX];

	static int ans(int n, int k) {
		if (n < 0 || k == 0) {
			return 0;
		}
		if (n == 0 || n == n - k) {
			return 1;
		}
		return dp[n][k] = dp[n][k] == 0 ? ans(n, k - 1) + ans(n - k, k) : dp[n][k];
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(ans(n - k, k));
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}