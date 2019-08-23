import java.util.*;
import java.io.*;

public class ShoeShopping {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		double arr[] = new double[a + 1];
		for (int i = 1; i <= a; i++) {
			arr[i] = sc.nextDouble();
		}
		double dp[] = new double[a + 1];

		for (int i = 1; i <= a; i++) {
			dp[i] = arr[i];
			dp[i] += dp[i - 1];
			if (i >= 2)
				dp[i] = Math.min(dp[i],
						Math.min(dp[i], dp[i - 2] - Math.min(arr[i], arr[i - 1]) / 2 + arr[i] + arr[i - 1]));
			if (i >= 3)
				dp[i] = Math.min(dp[i], dp[i - 3] - Math.min(arr[i - 2], Math.min(arr[i], arr[i - 1])) + arr[i]
						+ arr[i - 1] + arr[i - 2]);
		}
		System.out.printf("%.1f", dp[a]);
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