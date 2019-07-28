import java.util.*;
import java.io.*;

public class TudorDrinksEvenMoreTea {
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		if (a == b)
			return a;
		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		for (int i = a; i <= b; i++) {
			for (int j = c; j <= d; j++) {
				if(gcd(i,j)==1) {
					count++;
				}
			}
		}System.out.println(count);
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
