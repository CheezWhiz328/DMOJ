import java.util.*;
import java.io.*;

public class ds1 {
	static int MAX = 100005;

	static class BIT {

		long arr[];
		int n;

		public BIT(int n1) {
			n = n1;
			arr = new long[n];
		}

		public void update(long ind, long val) {
			for (long i = ind; i < arr.length; i += i & -i) {
				arr[(int) i] += val;
			}
		}

		public long count(int ind) {
			long count = 0;
			for (int i = ind; i > 0; i -= i & -i) {
				count += arr[i];
			}
			return count;
		}

	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int m = sc.nextInt();

		BIT BIT = new BIT(n + 5);
		BIT BIT1 = new BIT(MAX);
		for (int i = 1; i <= n; i++) {
			int v = sc.nextInt();
			BIT.update(i, v);
			BIT1.update(v, 1);
		}

		while (m-- > 0) {
			String s = sc.next();
			if (s.equals("C")) {
				int x = sc.nextInt();
				long v = sc.nextLong();

				long old = (BIT.count(x) - BIT.count(x - 1));
				BIT.update(x, v - old);

				BIT1.update(old, -1);
				BIT1.update(v, 1);

			} else if (s.equals("S")) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				System.out.println(BIT.count(r) - BIT.count(--l));
			} else {
				int v = sc.nextInt();
				System.out.println(BIT1.count(v));
			}
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
