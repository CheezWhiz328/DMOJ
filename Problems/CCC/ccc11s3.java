import java.util.*;
import java.io.*;

public class ccc11s3 {
	static int ans(int m, int x) {
		if (m >= 1) {
			int power = (int) Math.pow(5, m - 1);
			int loc = x / power;
			if (loc == 0 || loc == 4) {
				return 0;
			}
			if (loc == 1 || loc == 3) {
				return power + ans(m - 1, x % power);
			}
			if(loc==2) {
				return power * 2 + ans(m - 1, x % power);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(y<ans(m,x) ? "crystal" : "empty");
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
