import java.util.*;
import java.io.*;

public class ccc03s4 {
	static int LCP(String s, String s1) {
		for (int i = 0; i < Math.min(s.length(), s1.length()); i++) {
			if (s.charAt(i) != s1.charAt(i)) {
				return i;
			}

		}
		return Math.min(s.length(), s1.length());
	}

	static long ans(String s) {
		long count = s.length() * (s.length() + 1) / 2 + 1;

		String[] suffix = new String[s.length()];
		for (int i = 0; i < suffix.length; i++) {
			suffix[i] = s.substring(i, s.length());
		}
		Arrays.sort(suffix);

		for (int i = 0; i < s.length() - 1; i++) {
//			System.out.println(LCP(suffix[i], suffix[i + 1]));
			count -= LCP(suffix[i], suffix[i + 1]);
		}

		return count;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		while (n-- > 0) {
			String s = sc.next();
			System.out.println(ans(s));
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
