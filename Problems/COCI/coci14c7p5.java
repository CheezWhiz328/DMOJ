import java.util.*;
import java.io.*;

public class coci14c7p5 {
	static int MAX = 300005;
	static int n, k, arr[] = new int[MAX];
	static double psa[] = new double[MAX];
	static double l = 1;
	static double r = 1;

	static void print() {
		for (int i = 1; i <= n; i++) {
			System.out.print(psa[i] + " ");
		}
		System.out.println();
	}

	static boolean avg(double avg) {
		psa = new double[MAX];
		for (int i = 1; i <= n; i++) {
			psa[i] += psa[i - 1] + arr[i] - avg;
		}

//		print();

		double low = 0;
		for (int i = k; i <= n; i++) {
			if (psa[i] >= low) {
				return true;
			}
			low = Math.min(low, psa[i - k + 1]);
		}

		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		n = sc.nextInt();
		k = sc.nextInt();

		l = 1;
		r = 1;
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			r = Math.max(r, arr[i]);
		}

		while (l + 0.001 < r) {
			double mid = (l + r) / 2.0;
			if (avg(mid)) {
				l = mid;
			} else {
				r = mid;
			}
		}

		System.out.println(l);
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
