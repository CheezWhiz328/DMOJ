import java.util.*;
import java.io.*;

public class RidingtheCurve {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		double M = sc.nextInt();
		double K = sc.nextInt();
		double N = sc.nextInt();
		double c = 0.595 * N -K;
		if(c<0) {
			c=0;
		}
		if(c>M) {
			System.out.println("have mercy snew");
		}else {
			System.out.println((int)Math.ceil(c));
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
