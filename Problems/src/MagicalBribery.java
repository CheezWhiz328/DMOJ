import java.util.*;
import java.io.*;

public class MagicalBribery {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int dp[][] = new int[1005][1005];
		int arr[] = new int[1005];
		for (int i = 1; i <= a; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				dp[i][j] = j < i ? dp[i - 1][j]
						:  Math.max(dp[i - 1][j],
								Math.max(dp[i][j - i], dp[i - 1][j - i]) + arr[i]);
			}
		}
		System.out.println(dp[a][a]);
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
