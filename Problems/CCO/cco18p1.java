import java.util.*;
import java.io.*;

public class cco18p1 {
	static int n;

	static class game {
		boolean win;
		int point;

		game(boolean win1, int point1) {
			win = win1;
			point = point1;
		}

	}

	static game geese[];
	static game hawks[];

	static boolean good(int i, int j) {
		if (geese[i].win && !hawks[j].win && geese[i].point > hawks[j].point
				|| !geese[i].win && hawks[j].win && geese[i].point < hawks[j].point) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		n = sc.nextInt();

		String s = sc.next();

		geese = new game[n + 5];
		hawks = new game[n + 5];

		for (int i = 1; i <= n; i++) {
			geese[i] = new game(s.charAt(i - 1) == 'W' ? true : false, sc.nextInt());
		}

		s = sc.next();

		for (int i = 1; i <= n; i++) {
			hawks[i] = new game(s.charAt(i - 1) == 'W' ? true : false, sc.nextInt());
		}

		long dp[][] = new long[n + 5][n + 5];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

				if (good(i, j)) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + geese[i].point + hawks[j].point);
				}

			}

		}

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}

		System.out.println(dp[n][n]);

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
