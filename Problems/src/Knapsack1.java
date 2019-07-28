import java.util.*;
import java.io.*;

public class Knapsack1 {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int w = sc.nextInt();

		int weight[] = new int[n];
		int value[] = new int[n];
		long dp[] = new long[w];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = w; j >= weight[i]; j--) {

			}
		}
		System.out.println(dp[w]);
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
