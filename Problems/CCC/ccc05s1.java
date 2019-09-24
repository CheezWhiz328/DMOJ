import java.util.*;
import java.io.*;

public class ccc05s1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			String s = sc.next();
			s = s.replace("-", "");
			for (int i = 0; i < 10; i++) {
				if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					System.out.print(s.charAt(i));
				}

				if (s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') {
					System.out.print(2);
				}

				if (s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') {
					System.out.print(3);
				}

				if (s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') {
					System.out.print(4);
				}

				if (s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') {
					System.out.print(5);
				}

				if (s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') {
					System.out.print(6);
				}

				if (s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S') {
					System.out.print(7);
				}

				if (s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') {
					System.out.print(8);
				}

				if (s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z') {
					System.out.print(9);
				}

				if (i == 2 || i == 5) {
					System.out.print("-");
				}
			}
			System.out.println();
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
