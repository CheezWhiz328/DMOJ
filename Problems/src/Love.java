import java.io.*;
import java.util.StringTokenizer;

public class Love {

	static int count(String a, String b) {
		int m = a.length();
		int n = b.length();

		int lookup[][] = new int[m + 1][n + 1];

		for (int i = 0; i <= n; ++i)
			lookup[0][i] = 0;

		for (int i = 0; i <= m; ++i)
			lookup[i][0] = 1;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) lookup[i][j] = lookup[i - 1][j - 1] + lookup[i - 1][j];
				else lookup[i][j] = lookup[i - 1][j];
			}
		}

		return lookup[m][n];
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		String b = "love";

		System.out.println(count(a, b));
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