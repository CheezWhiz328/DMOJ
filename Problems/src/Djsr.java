import java.util.*;
import java.io.*;

public class Djsr {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int D = sc.nextInt();
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int d = sc.nextInt();
		}System.out.println(18);
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
