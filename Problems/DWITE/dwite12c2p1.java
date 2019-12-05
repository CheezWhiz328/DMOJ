import java.util.*;
import java.io.*;

public class dwite12c2p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = 5;
		while (t-- > 0) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int count = 0;
			int ccount = 0;
			int inc = 1;
			for (int i = 0; i < n; i += inc) {
				if (ccount == c) {
					inc *= 2;
					ccount = 0;
				}
				ccount++;

				count++;
			}
			System.out.println(count);
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
