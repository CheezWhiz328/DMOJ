import java.util.*;
import java.io.*;

public class Waiting {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String[] b = sc.next().split(":");
		int h = Integer.parseInt(b[0]);
		int m = Integer.parseInt(b[1]);
		int s = Integer.parseInt(b[2]);
		int a = h * 360 + m * 60 + s;
		b = sc.next().split(":");
		h = Integer.parseInt(b[0]);
		m = Integer.parseInt(b[1]);
		s = Integer.parseInt(b[2]);
		int a1 = h * 360 + m * 60 + s;
		System.out.println(a1-a);
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
