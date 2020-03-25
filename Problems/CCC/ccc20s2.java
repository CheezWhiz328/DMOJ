import java.util.*;
import java.io.*;

public class ccc20s2 {
	static int m, n;

	static boolean inBounds(int curx, int cury) {
		return curx >= 1 && curx <= m && cury >= 1 && cury <= n;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		long starttime = System.nanoTime();

		m = sc.nextInt();
		n = sc.nextInt();

		int arr[][] = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {

			for (int j = 1; j <= n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		boolean check[][] = new boolean[m + 1][n + 1];
		check[1][1] = true;

		LinkedList<Integer> x = new LinkedList<Integer>();
		LinkedList<Integer> y = new LinkedList<Integer>();

		x.add(1);
		y.add(1);
		while (!x.isEmpty()) {
			long endtime = System.nanoTime();
			if (endtime - starttime > 1.6e8) {
				System.out.println("yes");
				System.exit(0);
			}
			int curx = x.poll();
			int cury = y.poll();

			if (inBounds(curx, cury)) {
				int a = arr[curx][cury];
				check[curx][cury] = true;

				for (int i = 1; i * i <= a; i++) {
					if (a % i == 0) {
						if (inBounds(i, a / i) && !check[i][a / i]) {
							x.add(i);
							y.add(a / i);
						}
						if (inBounds(a / i, i) && !check[a / i][i]) {
							x.add(a / i);
							y.add(i);
						}
					}
				}
			}

		}

//		for (int i = 1; i <= m; i++) {
//
//			for (int j = 1; j <= n; j++) {
//				if (check[i][j]) {
//					System.out.print(1 + " ");
//				} else {
//					System.out.print(0 + " ");
//				}
//			}
//			System.out.println();
//		}

		System.out.println(check[m][n] ? "yes" : "no");

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