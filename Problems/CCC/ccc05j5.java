import java.util.*;
import java.io.*;

public class ccc05j5 {
	static boolean solve(String s) {
		if (s.equals("A")) {
			return true;
		}

		if (s.contains("ANA")) {
			s = s.replace("ANA", "A");
			return solve(s);
		}

		if (s.contains("BAS")) {
			s = s.replace("BAS", "A");
			return solve(s);
		}

		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		while (true) {
			String s = sc.next();
			if (s.equals("X")) {
				System.exit(0);
			}

			System.out.println(solve(s) ? "YES" : "NO");
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
