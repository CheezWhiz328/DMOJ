import java.util.*;
import java.io.*;

public class ncco3d2p1 {
	static int[] left = new int[400000], right = new int[400000];
	static int[] data = new int[100000];

	static int[] min = new int[400000];
	static int[] max = new int[400000];

	static void push_up(int segment) {
		min[segment] = Math.min(min[segment * 2], min[segment * 2 + 1]);
		max[segment] = Math.max(max[segment * 2], max[segment * 2 + 1]);
	}

	static void build(int l, int r, int segment) {
		left[segment] = l;
		right[segment] = r;

		if (l + 1 == r) {
			min[segment] = data[l];
			max[segment] = data[l];
			return;
		}

		int mid = (l + r) / 2;
		build(l, mid, segment * 2);
		build(mid, r, segment * 2 + 1);

		push_up(segment);
	}

	static int queryMin(int l, int r, int segment) {
		if (left[segment] >= r || right[segment] <= l)
			return Integer.MAX_VALUE;

		if (left[segment] >= l && right[segment] <= r)
			return min[segment];

		return Math.min(queryMin(l, r, segment * 2), queryMin(l, r, segment * 2 + 1));
	}

	static int queryMax(int l, int r, int segment) {
		if (left[segment] >= r || right[segment] <= l)
			return Integer.MIN_VALUE;

		if (left[segment] >= l && right[segment] <= r)
			return max[segment];

		return Math.max(queryMax(l, r, segment * 2), queryMax(l, r, segment * 2 + 1));
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int q = sc.nextInt();

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		build(0, n, 1);

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt();
			System.out.println(queryMax(l, r, 1) - queryMin(l, r, 1));
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
