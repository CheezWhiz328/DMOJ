import java.util.*;
import java.io.*;

public class Hsiung {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean dp[] = new boolean[c + 1];
		dp[0] = true;
		for (int i = 0; i <= c; i++) {
			if (dp[i]) {
				if (i + a <= c) {
					dp[i + a] = true;
				}
				if (i + b <= c) {
					dp[i + b] = true;
				}
			}
		}
		int max = 0;
		for (int i = 0; i <= c; i++) {
			if (dp[i]) {
				max = i;
			}
		}System.out.println(max);

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
