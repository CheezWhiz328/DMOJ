import java.io.*;
import java.util.*;

public class mnyc17p3 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		String a = sc.next();
		String b = sc.next();

		long[] hash = new long[Math.min(a.length(), b.length())];
		long key = 37;
		hash[0] = 1;
		for (int i = 1; i < hash.length; i++) {
			hash[i] = hash[i - 1] * key;
		}

		long value = 0;
		long value1 = 0;
		int ind = 0;
		for (int i = 0; i < hash.length; i++) {
			value += hash[i] * (a.charAt(a.length() - i - 1) - 'A');
			value1 = value1 * key + (b.charAt(i) - 'A');
//			System.out.println(value + " " + value1);
			if (value == value1) {
				ind = i + 1;
			}
		}

		System.out.println(a + b.substring(ind));
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
