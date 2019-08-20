import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SimonAndMarcy {

	static int knapSack(int W, int wt[], int val[]) {
		int dp[][] = new int[val.length + 1][W + 1];
		for (int i = 0; i <= val.length; i++) {
			for (int j = 0; j <= W; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (wt[i - 1] <= j)
					dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
				else
					dp[i][j] = dp[i - 1][j];
			}
		}

		return dp[val.length][W];
	}

	public static void main(String args[]) {
		FastReader sc = new FastReader();
		int c = sc.nextInt();
		int W = sc.nextInt();
		int val[] = new int[c];
		int wt[] = new int[c];

		for (int i = 0; i < c; i++) {
			val[i] = sc.nextInt();
			wt[i] = sc.nextInt();
		}
		System.out.println(knapSack(W, wt, val));
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