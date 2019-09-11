import java.util.*;
import java.io.*;

public class ioi94p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int arr[][] = new int[a+1][a+1];
		int dp[][] = new int[a+1][a+1];
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		dp[1][1] = arr[1][1];
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				dp[i][j] = Math.max(dp[i-1][j] + arr[i][j], dp[i-1][j-1]+arr[i][j]);
			}
		}
//		for(int i=1; i<a+1; i++) {
//			for(int j=1; j<a+1; j++) {
//				System.out.print(dp[i][j]+" ");
//			}System.out.println();
//		}
		int max = 0;
		for(int i=0; i<a; i++) {
			max = Math.max(max, dp[a][i]);
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