import java.util.*;
import java.io.*;

public class FujoNeko {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean X[] = new boolean[1005];
		boolean Y[] = new boolean[1005];
		for (int i = 1; i <= x; i++) {
			String s = sc.next();
			for (int j = 0; j < y; j++) {
				if(s.charAt(j)=='X') {
					Y[i] = true;
					X[j+1] = true;
				}
			}
		}
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println(X[x]||Y[y] ? "Y" : "N");
			
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