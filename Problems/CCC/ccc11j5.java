import java.util.*;
import java.io.*;

public class ccc11j5 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int dp[] = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			dp[i] = 1;
		}
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			dp[a] *= dp[i] + 1;
		}

		System.out.println(dp[n]);
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
