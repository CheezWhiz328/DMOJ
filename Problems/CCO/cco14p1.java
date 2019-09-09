import java.util.*;
import java.io.*;

public class cco14p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int max = 2005;
		long count = 0;
		boolean arr[][] = new boolean[max][max];
		int dp[][] = new int[max][max];
		for (int i = 1; i <= a; i++) {
			String b = sc.next();
			for (int j = 0; j < a; j++) {
				arr[i][j + 1] = b.charAt(j) == '#' ? true : false;
				count = b.charAt(j) == '#' ? count+1 : count;
			}
		}

		for (int i = a - 1; i > 0; i--) {
			for (int j = 1; j <= a; j++) {
				if (arr[i][j] && arr[i + 1][j] && arr[i + 1][j - 1] && arr[i + 1][j + 1]) {
					dp[i][j] = Math.min(dp[i + 1][j - 1], dp[i + 1][j + 1]) + 1;
				}
				count += dp[i][j];
			}
		}
//		for (int i = 1; i <= a; i++) {
//			for (int j = 0; j < a; j++) {
//				System.out.print(dp[i][j]);
//			}
//			System.out.println();
//		}
		System.out.println(count);
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