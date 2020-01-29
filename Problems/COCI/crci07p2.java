import java.util.*;
import java.io.*;

public class crci07p2 {
	static int cost[][] = new int[1005][1005];
	static int arr[] = new int[1005];
	static int n;
	static int ans = 1 << 30;

	static int solve(int i, int j) {

		if (i < 0 || i >= n) {
			return 1 << 30;
		}

		if (i == n - 1) {
			return arr[i];
		}

		ans = cost[i][j];

		if (ans != 1 << 30) {
			return ans;
		}

		ans = 1 << 30;

		ans = Math.min(solve(i - j, j) + arr[i], solve(i + j + 1, j + 1) + arr[i]);

		return cost[i][j] = ans;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		cost = new int[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(cost[i], 1 << 30);
		}

		solve(1, 1);

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
