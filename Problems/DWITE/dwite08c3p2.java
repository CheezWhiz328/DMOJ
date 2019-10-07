import java.util.*;
import java.io.*;

public class dwite08c3p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for (int t = 0; t < 5; t++) {
			String s = sc.nextLine();
			int wcount = 0;
			String s1 = "";
			for (int i = 0; i < s.length(); i++) {
//				System.out.println(s1);
				if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
					s1 += s.substring(i, i + 1);
				} else {
					if (s1.length() >= 4) {
						wcount++;

					}
					s1 = "";
				}
			}
			if (s1.length() >= 4) {
				wcount++;

			}
			System.out.println(wcount);
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
