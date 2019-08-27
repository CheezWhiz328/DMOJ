import java.util.*;
import java.io.*;

public class LOL {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int x[] = new int[a];
		int y[] = new int[a];
		for(int i=0; i<a; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}Arrays.sort(x);
		Arrays.sort(y);
		System.out.println(Math.abs((x[a-1]-x[0])*(y[a-1]-y[0])));
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
