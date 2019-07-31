import java.util.*;
import java.io.*;

public class CrayolaLightsaber {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int[] col = new int[6];
		int count = 0;
		for (int i = 0; i < a; i++) {
			count++;
			String b = sc.next();
			if (b.equals("red")) {
				col[0]++;
			}
			if (b.equals("orange")) {
				col[1]++;
			}
			if (b.equals("yellow")) {
				col[2]++;
			}
			if (b.equals("green")) {
				col[3]++;
			}
			if (b.equals("blue")) {
				col[4]++;
			}
			if (b.equals("black")) {
				col[5]++;
			}
		}

		int max = 0;
		for (int i = 0; i < 6; i++) {
			if (col[i] > max)
				max = col[i];
		}
		int r = count - max;
		System.out.println(Math.min(max, r + 1) + r);
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