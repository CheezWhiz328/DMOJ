import java.util.*;
import java.io.*;

public class CrossingField {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = new int[a][a];
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean path[][] = new boolean[a][a];
		path[0][0] = true;
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(i!=0&&Math.abs(arr[i][j]-arr[i-1][j])<=b && path[i-1][j] || j!=0&&Math.abs(arr[i][j]-arr[i][j-1])<=b && path[i][j-1]){
					path[i][j] = true;
				}
			}
		}System.out.println(path[a-1][a-1] ? "yes" : "no");
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
