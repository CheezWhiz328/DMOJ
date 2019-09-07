import java.util.*;
import java.io.*;

public class QueensCantAttackMe {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int q = sc.nextInt();
		boolean arr[][] = new boolean[n][n];
		for(int i=0; i<q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			x--;
			y--;
			for(int j=x; j<n; j++) {
				arr[j][y] = true;
			}
			
			for(int j=x; j>=0; j--) {
				arr[j][y] = true;
			}
			
			for(int j=y; j<n; j++) {
				arr[x][j] = true;
			}
			
			for(int j=y; j>=0; j--) {
				arr[x][j] = true;
			}
			
			int x1 = x;
			int y1 = y;
			while(x1<n && y1<n) {
				arr[x1][y1] = true;
				x1++;
				y1++;
			}
			
			x1 = x;
			y1 = y;
			while(x1>=0 && y1>=0) {
				arr[x1][y1] = true;
				x1--;
				y1--;
			}
			
			x1 = x;
			y1 = y;
			while(x1>=0 && y1<n) {
				arr[x1][y1] = true;
				x1--;
				y1++;
			}
			
			x1 = x;
			y1 = y;
			while(x1<n && y1>=0) {
				arr[x1][y1] = true;
				x1++;
				y1--;
			}
			
		}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!arr[i][j]) {
					count++;
				}
//				System.out.print(arr[i][j]?1:0);
			}
//			System.out.println();
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
