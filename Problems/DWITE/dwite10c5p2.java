import java.io.*;
import java.util.*;

public class dwite10c5p2 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int t = 5;
		while (t-- > 0) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int rooks = sc.nextInt();
			boolean rows[] = new boolean[r];
			boolean cols[] = new boolean[c];
			for (int i = 0; i < rooks; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				rows[x] = true;
				cols[y] = true;
			}
			int rcount = 0;
			int ccount = 0;
			for (int i = 0; i < r; i++) {
				if (!rows[i]) {
					rcount++;
				}
			}
			for (int i = 0; i < c; i++) {
				if (!cols[i]) {
					ccount++;
				}
			}
			System.out.println(rcount * ccount);
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