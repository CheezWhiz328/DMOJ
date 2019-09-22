import java.io.*;
import java.util.*;

public class ccc06j4 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		boolean[][] grid = new boolean[8][8];
		grid[1][7] = true;
		grid[1][4] = true;
		grid[2][1] = true;
		grid[3][4] = true;
		grid[3][5] = true;

		int[] todo = new int[8];
		todo[1] = 1;
		todo[4] = 2;
		todo[5] = 1;
		todo[7] = 1;

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			todo[y]++;
			grid[x][y] = true;
		}

		LinkedList<Integer> order = new LinkedList<Integer>();
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (todo[j] == 0) {
					order.add(j);
					todo[j]--;
					for (int k = 1; k <= 7; k++) {
						if (grid[j][k]) {
							grid[j][k] = false;
							todo[k]--;
						}
					}
					break;
				}
			}

		}

		if (order.size() != 7) {
			System.out.print("Cannot complete these tasks. Going to bed.");
		} else {
			for (int i = 0; i < 7; i++) {
				System.out.print(order.get(i) + " ");
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