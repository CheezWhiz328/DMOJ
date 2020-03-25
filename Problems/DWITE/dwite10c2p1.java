import java.io.*;
import java.util.*;

public class dwite10c2p1 {
	static boolean vowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = 5;
		while (t-- > 0) {
			String s = sc.next();
			String s1 = sc.next();
			if (s.length() != s1.length()) {
				System.out.println("different");

			} else {
				boolean same = true;
				for (int i = 0; i < s.length(); i++) {
					if (vowel(s.charAt(i)) != vowel(s1.charAt(i))) {
						System.out.println("different");
						same = false;
						break;
					}
				}
				if (same) {
					System.out.println("same");
				}
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
