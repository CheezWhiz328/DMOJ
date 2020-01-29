import java.util.*;
import java.io.*;

public class ccc17s3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();

		int MAX = 4005;
		int arr[] = new int[MAX];

		for (int i = 0; i < n; i++) {
			arr[sc.nextInt()]++;
		}

		int ans[] = new int[MAX];

		for (int i = 0; i < MAX; i++) {
			if (arr[i] != 0) {

				for (int j = i; j < MAX; j++) {
					if (i == j) {
						ans[i + j] += arr[i] >> 1;
					} else if (arr[j] != 0) {
						ans[i + j] += Math.min(arr[i], arr[j]);
					}
				}
			}
		}

		int solve = 0;
		int solve1 = 0;
		for (int i = 0; i < MAX; i++) {
			if (ans[i] > solve) {
				solve = ans[i];
				solve1 = 1;
			} else if (ans[i] == solve) {
				solve1++;
			}
		}

		System.out.println(solve + " " + solve1);

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
