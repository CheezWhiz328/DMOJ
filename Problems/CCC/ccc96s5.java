import java.util.*;
import java.io.*;

public class ccc96s5 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			int MAX = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i] == b[j]) {
						MAX = Math.max(MAX, j - i);
					}
				}
			}

			System.out.println("The maximum distance is " + MAX);
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
