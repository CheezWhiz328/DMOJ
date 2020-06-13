import java.io.*;
import java.util.*;

public class ccc06j3 {
	static String s;

	static int solve() {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'd' || c == 'g' || c == 'j' || c == 'm' || c == 'p' || c == 't' || c == 'w') {
				count++;
			} else if (c == 'b' || c == 'e' || c == 'h' || c == 'k' || c == 'n' || c == 'q' || c == 'u' || c == 'x') {
				count += 2;
			} else if (c == 'c' || c == 'f' || c == 'i' || c == 'l' || c == 'o' || c == 'r' || c == 'v' || c == 'y') {
				count += 3;
			} else {
				count += 4;
			}
		}

		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			char c1 = s.charAt(i + 1);
			if ((c == 'a' || c == 'b' || c == 'c') && (c1 == 'a' || c1 == 'b' || c1 == 'c')) {
				count += 2;
			} else if ((c == 'd' || c == 'e' || c == 'f') && (c1 == 'd' || c1 == 'e' || c1 == 'f')) {
				count += 2;
			} else if ((c == 'g' || c == 'h' || c == 'i') && (c1 == 'g' || c1 == 'h' || c1 == 'i')) {
				count += 2;
			} else if (c == 'j' || c == 'k' || c == 'l' && (c1 == 'j' || c1 == 'k' || c1 == 'l')) {
				count += 2;
			} else if ((c == 'm' || c == 'n' || c == 'o') && (c1 == 'm' || c1 == 'n' || c1 == 'o')) {
				count += 2;
			} else if ((c == 'p' || c == 'q' || c == 'r' || c == 's')
					&& (c1 == 'p' || c1 == 'q' || c1 == 'r' || c1 == 's')) {
				count += 2;
			} else if ((c == 't' || c == 'u' || c == 'v') && (c1 == 't' || c1 == 'u' || c1 == 'v')) {
				count += 2;
			} else if ((c == 'w' || c == 'x' || c == 'y' || c == 'z')
					&& (c1 == 'w' || c1 == 'x' || c1 == 'y' || c1 == 'z')) {
				count += 2;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		for (;;) {
			s = sc.next();
			if (s.equals("halt")) {
				return;
			}
			System.out.println(solve());
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
