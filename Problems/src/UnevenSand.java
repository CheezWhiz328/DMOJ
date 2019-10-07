import java.io.*;
import java.util.*;

public class UnevenSand {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int len = 2000000000;

		int l = 1;
		int r = len;

		while (l <= r) {
			int ind = (int) (l / 2.0 + r / 2.0);
			System.out.println(ind);
			String s = sc.next();
			if (s.equals("OK")) {
				System.exit(0);
			}
			if (s.equals("SINKS")) {
				l = ind + 1;
			} else {
				r = ind - 1;

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
