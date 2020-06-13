import java.io.*;
import java.util.*;

public class gnyr12x {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int p = sc.nextInt();
		while (p-- > 0) {
			int d = sc.nextInt();
			char arr[] = sc.nextLine().toCharArray();
			int n = sc.nextInt();
			int cur = 0;
			String s = "";
			for (int i = 0; i < n; i++) {
				cur += (sc.nextInt() + arr.length);
				cur %= arr.length;
				s += arr[cur];
			}

			System.out.println(d + " " + s);
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
