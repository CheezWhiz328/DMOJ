import java.util.*;
import java.io.*;

public class ccc13s5 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long count = 0;
		while (n > 1) {
			boolean prime = true;
			for (int fac = 2; fac * fac <= n; fac++) {
				if (n % fac == 0) {
					prime = false;
					int temp = n/fac;
					n -= temp;
					count += n/temp;
					break;
				}
			}
			if (prime) {
				n--;
				count += n;
			}
//			System.out.println(n);
		}
		System.out.println(count);
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
