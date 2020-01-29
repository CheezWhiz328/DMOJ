import java.util.*;
import java.io.*;

public class si17c1p8 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int t = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		long count = 0;
		for (int i = 0; i < 1 << n; i++) {
			int count1 = 0;
			for (int j = n - 1; j >= 0; j--) {
				if (((i >> j) & 1) == 1) {
					count1 += arr[j];
//					System.out.print(1);
				} else {
//					System.out.print(0);
				}
			}
			if (count1 == t) {
				count++;
			}
//			System.out.println();

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
