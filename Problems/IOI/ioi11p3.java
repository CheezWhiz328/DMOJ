import java.util.*;
import java.io.*;

public class ioi11p3 {

	static long psa[];
	static int r, l;
	static long b;
	static int range = 0;

	static long cost(int left, int right) {
		int mid = (left + right) / 2;
		if ((range & 1) == 0) {
			return (psa[right] - psa[mid]) - (psa[mid - 1] - psa[left - 1]);
		} else {
			return (psa[right] - psa[mid]) - (psa[mid] - psa[left - 1]);
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		r = sc.nextInt();
		l = sc.nextInt();
		b = sc.nextLong();

		psa = new long[r + 1];

		for (int i = 1; i <= r; i++) {
			psa[i] = sc.nextInt() + psa[i - 1];
		}

		long max = 0;
		int left = 1;
		int right = 1;
		range = right - left + 1;
		while (left <= r) {
			while (right < r && cost(left, right + 1) <= b) {
				right++;
				range++;
			}
			max = Math.max(max, range);
			left++;
			range--;
		}

		System.out.println(max);

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
