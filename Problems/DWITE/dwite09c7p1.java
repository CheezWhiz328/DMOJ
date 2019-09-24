import java.util.*;
import java.io.*;

public class dwite09c7p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			a += 1 << 30;
			int b = sc.nextInt();
			String c = Integer.toBinaryString(a);
			System.out.println(c.charAt(c.length() - b - 1) == '1' ? 1 : 0);
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