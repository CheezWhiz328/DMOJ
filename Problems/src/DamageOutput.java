import java.util.*;
import java.io.*;

public class DamageOutput {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] arr = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt() + arr[i - 1];
		}
		long min = 500000;
		int l = 0, r = 0;
		while (r <= n) {
			long count = l > 0 ? arr[r] - arr[l - 1] : arr[r];
			if (count >= m) {
				min = Math.min(min, r - l + 1);
				l++;
			} else {
				r++;
			}
		}
		System.out.println(min != 500000 ? min : -1);

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