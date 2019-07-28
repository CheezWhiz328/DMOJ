import java.util.*;
import java.io.*;

public class ThatMissingNumber {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for(int i=0; i<5; i++) {
			int a = sc.nextInt();
			int sum = (a+1) * (a+2) /2;
			for(int j=0; j<a; j++) {
				sum -= sc.nextInt();
			}
			System.out.println(sum);
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
