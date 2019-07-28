import java.util.*;
import java.io.*;

public class PlayingWithPaper {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long count = 0;
		while(a>=1 && b>=1) {
			if(b<a) {
				long a1 = a;
				a = b;
				b = a1;
			}
			count += b/a;
			b%=a;
		}
		System.out.println(count);
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
