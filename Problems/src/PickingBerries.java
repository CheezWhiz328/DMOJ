import java.util.*;
import java.io.*;

public class PickingBerries {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		char[][] grid = new char[105][105];
		
		int count = 0;
		
		for(int i=0; i<b; i++) {
			String s = sc.nextLine();

			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)=='#') {
					grid[i][j] = '#';
				}else if(s.charAt(j)=='o') {
					count++;
				}
			}
		}
		
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				if(grid[i][j]=='#') {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		for(int i=0; i<count; i++) {
			System.out.print('o');
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
