import java.util.*;
import java.io.*;

public class ccc12s3 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();

		int arr[] = new int[1005];

		for (int i = 0; i < n; i++) {
			arr[sc.nextInt()]++;
		}

		int max = 0;
		int maxind = 0;
		int max1 = 0;
		int max1ind = 0;

		for (int i = 0; i < 1005; i++) {
			if (arr[i] > max) {
				if (max == 0) {
					max = arr[i];
					maxind = i;
				} else {
					max1 = max;
					max = arr[i];
					max1ind = maxind;
					maxind = i;
				}
			}
		}

		int MAX = 0;
		int MAXind = 0;
		int MAX1 = 0;
		int MAX1ind = 0;

		for (int i = 1004; i >= 0; i--) {
			if (arr[i] > MAX) {
				if (MAX == 0) {
					MAX = arr[i];
					MAXind = i;
				} else {
					MAX1 = MAX;
					MAX = arr[i];
					MAX1ind = MAXind;
					MAXind = i;
				}
			}
		}

		if (max1 == 0 && MAX1 == 0) {
			System.out.println(Math.abs(maxind - MAXind));
		} else {
			System.out.println(Math.max(Math.abs(max1ind - MAXind), Math.abs(maxind - MAX1ind)));
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
