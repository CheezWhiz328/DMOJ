import java.util.*;
import java.io.*;

public class dmopc17c2p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		int count = 0;
		for(int i=0; i<N; i++) {
			int c = sc.nextInt();
			int v = sc.nextInt();
			if(c>0 && v>0) {
				count+=c;
			}
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
