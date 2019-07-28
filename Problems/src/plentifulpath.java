import java.util.*;
import java.io.*;

public class plentifulpath {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] grid = new boolean[n+1][m+1];
		int x = sc.nextInt();
		int y = sc.nextInt();
		while(x!=0) {
			grid[x][y] = true;
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		int[][] count = new int[n+1][m+1];
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(grid[i][j]) {
					count[i][j]++;
				}count[i][j]+=Math.max(count[i-1][j],count[i][j-1]);
//				System.out.print(count[i][j]);
			}
//			System.out.println();
		}System.out.println(count[n][m]);
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
