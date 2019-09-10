import java.util.*;
import java.io.*;

public class coci07c4p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		for (int i = 0; i < 3; i++) {
			int N = sc.nextInt();
			int count = 0;
			if (N % (a + b) <= a && N % (a + b) != 0) {
				count++;
			}
			
			if (N % (c + d) <= c && N % (c + d) != 0) {
				count++;
			}
			
			if(count==0) {
				System.out.println("none");
			}else if(count==1) {
				System.out.println("one");
			}else {
				System.out.println("both");
			}
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
