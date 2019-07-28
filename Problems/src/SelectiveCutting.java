import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectiveCutting {
	int st[] = new int[400005];
	SelectiveCutting(int arr[], int n) {
		int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
		int max_size = 2 * (int) Math.pow(2, x) - 1;

		st = new int[max_size];
		build(arr, 0, n - 1, 0);
	}


	int getMid(int s, int e) {
		return s + (e - s) / 2;
	}

	int getSum(int ss, int se, int qs, int qe, int si) {
		if (qs <= ss && qe >= se)
			return st[si];

		if (se < qs || ss > qe)
			return 0;

		int mid = getMid(ss, se);
		return getSum(ss, mid, qs, qe, 2 * si + 1) + getSum(mid + 1, se, qs, qe, 2 * si + 2);
	}

	void updateValueUtil(int ss, int se, int i, int diff, int si) {
		if (i < ss || i > se)
			return;
		st[si] = st[si] + diff;
		if (se != ss) {
			int mid = getMid(ss, se);
			updateValueUtil(ss, mid, i, diff, 2 * si + 1);
			updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
		}
	}

	int build(int arr[], int ss, int se, int si) {
		if (ss == se) {
			st[si] = arr[ss];
			return arr[ss];
		}
		int mid = getMid(ss, se);
		st[si] = build(arr, ss, mid, si * 2 + 1) + build(arr, mid + 1, se, si * 2 + 2);
		return st[si];
	}

	public static void main(String args[]) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		SelectiveCutting tree = new SelectiveCutting(arr, n);

		int q = sc.nextInt();
		for(int i=0; i<q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int min = sc.nextInt();
			System.out.println(tree.getSum(0, n - 1, l, r, 0));
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