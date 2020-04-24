import java.io.*;
import java.util.*;

public class ccoprep16c2q2 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int dp[] = new int[35];
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int cur = 1;

			for (int j = 0; j < 32; j++) {
				if ((arr[i] & (1 << j)) != 0) {
					cur = Math.max(cur, dp[j] + 1);
					
				}
			}
			for (int j = 0; j < 32; j++) {
				if ((arr[i] & (1 << j)) != 0) {
					dp[j] = Math.max(dp[j], cur);
				}
			}
			ans = Math.max(ans, cur);
		}

		System.out.println(ans);

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
