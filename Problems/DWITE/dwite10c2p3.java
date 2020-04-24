import java.io.*;
import java.util.*;

public class dwite10c2p3 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int t = 5;
		while (t-- > 0) {
			int grid[][] = new int[9][9];
			for (int i = 8; i >= 1; i--) {
				String s = " " + sc.next();
				for (int j = 1; j <= 8; j++) {
					if (s.charAt(j) == '#') {
						grid[i][j] = -(1 << 30);
					} else if (s.charAt(j) == '.') {
						grid[i][j] = 0;
					} else {
						grid[i][j] = s.charAt(j) - '0';
					}
				}
			}

			sc.next();

			int dp[][] = new int[9][9];

			for (int i = 1; i < 9; i++) {
				for (int j = 1; j < 9; j++) {
					if (grid[i][j] != -(1 << 30)) {
						dp[i][j] = grid[i][j] + Math.max(dp[i][j - 1], dp[i - 1][j]);
					}
				}
			}

			System.out.println(dp[8][8]);

		}
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
