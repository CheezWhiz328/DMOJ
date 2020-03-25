import java.util.*;
import java.io.*;

public class ccc20s5 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int max = 1;
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			max = Math.max(max, b[i]);
		}

		int[] last = new int[max + 5];
		for (int i = 0; i < n; i++) {
			last[b[i]] = i;
		}

		double[] dp = new double[max + 5];
		double count = 1.0 / n;
		
		for (int i = 0; i < n; i++) {
			if (b[i] != b[0]) {
				dp[b[i]] += count;
			}
			if (i == last[b[i]]) {
				count += dp[b[i]] / (n - i);
			}
		}
		System.out.printf("%.9f\n", 1.0 - dp[b[n - 1]]);
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
