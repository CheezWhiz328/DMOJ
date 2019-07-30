import java.util.*;
import java.io.*;

public class LoveGuru {
	static int ans(String a) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			int b = a.charAt(i) - 'a' + 1;
			b %= 10;
			int c = b;
			if (b == 1 || b == 5 || b == 6 || b == 0) {

			} else {

				for (int j = 0; j < i; j++) {
					c *= b;
					c %= 10;
				}
			}
			count += c;
			count %= 10;

		}
		if (count == 0) {
			count = 10;
		}
		return count;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		a = a.toLowerCase();
		String b = sc.next();
		b = b.toLowerCase();
		System.out.println(ans(a) + ans(b));

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
