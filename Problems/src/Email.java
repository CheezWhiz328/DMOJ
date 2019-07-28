import java.util.*;
import java.io.*;

public class Email {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for(int i=0; i<10; i++) {
			int a = sc.nextInt();
			String b[] = new String[a];
			for(int j=0; j<a; j++) {
				String c = sc.next();
				c = c.toLowerCase();
				System.out.println(c);
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
