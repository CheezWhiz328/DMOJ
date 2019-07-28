import java.util.*;
import java.io.*;

public class EscapeAndLoot {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		for(int i=0; i<1; i++) {
			int[][] grid = new int[10][10];
			int[][] path = new int[10][10];
			
			for(int j=1; j<9; j++) {
				String s = sc.next();
				for(int k=0; k<s.length(); k++) {
					if(s.charAt(k)=='#') {
						grid[j][k+1] = -(1<<30);
					}else if(s.charAt(k)=='.') {
						grid[j][k+1] = 0;
					}else {
						grid[j][k+1] = s.charAt(k) - '0';
					}
					System.out.print(grid[j][k+1]);
				}System.out.println();
			}String s = sc.nextLine();
			
			for(int k = 1; k<=8; k++) {
				for(int j=1; j<=8; j++) {
					if(grid[k][j]>0) {
						path[j][j] = grid[k][j];
					}
					path[k][j]+=Math.max(path[k-1][j],path[k][j-1]);
				}
			}System.out.println(path[8][8]);
			
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
