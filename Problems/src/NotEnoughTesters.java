import java.util.*;
import java.io.*;

public class NotEnoughTesters {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int[] b = new int[100005];
		for (int i = 1; i <= 100000; i++) {
			for (int j = i; j <= 100000; j += i) {
				b[j]++;
			}
		}
//		int max = 0;
//		for (int i = 1; i <= 100000; i++) {
//			max = Math.max(b[i], max);
//		}
//		System.out.println(max);

		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int count = 0;
			int fac = sc.nextInt();
			int beg = sc.nextInt();
			int end = sc.nextInt();
			if (fac > 1<<7) {
				System.out.println(count);
			} else {
				for (int j = beg; j <= end; j++) {
					if (b[j] == fac) {
						count++;
					}
				}
				System.out.println(count);
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
