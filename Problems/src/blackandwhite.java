import java.util.*;
import java.io.*;

public class blackandwhite {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] grid = new boolean[n][n];
		for(int i=0; i<m; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for(int j=x1; j<x1+x2; j++) {
				for(int k=y1; k<y1+y2; k++) {
					grid[j][k] = !grid[j][k];
				}
			}
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j])count++;
			}
		}System.out.println(count);

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
