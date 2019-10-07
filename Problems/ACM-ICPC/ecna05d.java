import java.util.*;
import java.io.*;

public class ecna05d {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int num = 0;
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) {
				System.exit(0);
			}
			num++;
			boolean grid[][] = new boolean[n + 1][m + 1];
			boolean pieces[][] = new boolean[n + 1][m + 1];
			int q = sc.nextInt();
			LinkedList<Integer> a = new LinkedList<Integer>();
			LinkedList<Integer> b = new LinkedList<Integer>();
			for (int i = 0; i < q; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				grid[x][y] = true;
				pieces[x][y] = true;

				a.add(x);
				b.add(y);
			}
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				grid[x][y] = true;
				pieces[x][y] = true;
				if (x + 2 <= n && y + 1 <= m) {
					grid[x + 2][y + 1] = true;
				}
				if (x + 2 <= n && y - 1 >= 1) {
					grid[x + 2][y - 1] = true;
				}
				if (x + 1 <= n && y + 2 <= m) {
					grid[x + 1][y + 2] = true;
				}
				if (x + 1 <= n && y - 1 >= 1) {
					grid[x + 1][y - 2] = true;
				}
				if (x - 1 >= 1 && y + 2 <= m) {
					grid[x - 1][y + 2] = true;
				}
				if (x - 1 >= 1 && y - 2 >= 1) {
					grid[x - 1][y - 2] = true;
				}
				if (x - 2 >= 1 && y + 1 <= m) {
					grid[x - 2][y + 1] = true;
				}
				if (x - 2 >= 1 && y - 1 >= 1) {
					grid[x - 2][y - 1] = true;
				}

			}
			int p = sc.nextInt();
			for (int i = 0; i < p; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				grid[x][y] = true;
				pieces[x][y] = true;
			}
			for (int t = 0; t < a.size(); t++) {
				int x = a.get(t);
				int y = b.get(t);
				for (int i = x + 1; i <= n; i++) {
					if (pieces[i][y]) {
						break;
					}
					grid[i][y] = true;
				}
				for (int i = x - 1; i >= 1; i--) {
					if (pieces[i][y]) {
						break;
					}
					grid[i][y] = true;
				}
				for (int i = y + 1; i <= m; i++) {
					if (pieces[x][i]) {
						break;
					}
					grid[x][i] = true;
				}
				for (int i = y - 1; i >= 1; i--) {
					if (pieces[x][i]) {
						break;
					}
					grid[x][i] = true;
				}
				int i = 0;
				while (true) {
					i++;
					if (x + i > n || y + i > m || pieces[x + i][y + i]) {
						break;
					}
					grid[x + i][y + i] = true;
				}
				i = 0;
				while (true) {
					i++;
					if (x - i < 1 || y - i < 1 || pieces[x - i][y - i]) {
						break;
					}
					grid[x - i][y - i] = true;
				}
				i = 0;
				while (true) {
					i++;
					if (x - i < 1 || y + i > m || pieces[x - i][y + i]) {
						break;
					}
					grid[x - i][y + i] = true;
				}
				i = 0;
				while (true) {
					i++;
					if (x + i > n || y - i < 1 || pieces[x + i][y - i]) {
						break;
					}
					grid[x + i][y - i] = true;
				}

			}
			int count = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
//					System.out.print(grid[i][j] ? 1 : 0);
					if (!grid[i][j]) {
						count++;
					}
//					if(grid[i][j]!=grid[j][i]) {
//						System.out.println(i+" "+j);
//					}
				}
//				System.out.println();
			}
			System.out.println("Board "+num+" has "+count+" safe squares.");

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
