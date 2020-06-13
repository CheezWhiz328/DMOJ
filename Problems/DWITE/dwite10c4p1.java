import java.io.*;
import java.util.*;

public class dwite10c4p1 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int t = 5;
		while (t-- > 0) {
			int n = sc.nextInt();
			int w = n % 2 == 0 ? n - 1 : n;
			for (int i = 0; i < n; i++) {
				int bad = i % 2 == 0 ? i + 1 : i;
				for (int j = 0; j < (w - bad) / 2; j++) {
					System.out.print(".");
				}
				for (int j = 0; j < bad; j++) {
					System.out.print("*");
				}

				for (int j = 0; j < (w - bad) / 2; j++) {
					System.out.print(".");
				}

				System.out.println();
			}

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
