import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//not mouse journey
public class grid1 {
	static int[][] dp = new int[105][105];// store previously calculated answer

	static boolean[][] grid = new boolean[105][105];

	static int ways(int r, int c) {
		if (r < 0 || c < 0) {// out of bounds: cannot go
			return 0;
		}
		if (r == 0 && c == 0) {// starting position
			return 1;
		}
		if (grid[r][c]) {// has cat, cannot go
			return 0;
		}

		if (dp[r][c] == -1) {// if answer is not calculated yet
			dp[r][c] = ways(r - 1, c) % 1000000007 + ways(r, c - 1) % 1000000007;// calculate it
		}

		return dp[r][c];
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				dp[i][j] = -1;
			}
		}
		
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)=='#') {
					grid[i][j] = true;
				}
				
			}
		}
		
		System.out.println(ways(n - 1, m - 1) % 1000000007);
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
