import java.util.*;
import java.io.*;

public class TheBigClock {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int h = sc.nextInt();
		int m = sc.nextInt();
		int add = sc.nextInt();
		h += (add + m) / 60;
		h %= 24;
		m += add;
		m %= 60;
		System.out.println(h + " " + m);
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
