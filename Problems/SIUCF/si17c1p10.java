import java.util.*;
import java.io.*;

public class si17c1p10 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for(int i=0; i<2; i++) {
			int a = sc.nextInt();
			int b[] = new int[a];
			int c[] = new int[a];
			for(int j=0; j<a; j++) {
				b[j] = sc.nextInt();
			}for(int j=0; j<a; j++) {
				c[j] = sc.nextInt();
			}int count = 0;
			for(int j=0; j<a; j++) {
				count += b[j]*c[j];
			}System.out.print(count+" ");
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
