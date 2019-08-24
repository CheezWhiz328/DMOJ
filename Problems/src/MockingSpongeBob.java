import java.util.*;
import java.io.*;

public class MockingSpongeBob {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			String b = sc.nextLine();
			b = b.toUpperCase();
			char[] c = b.toCharArray();
			boolean count = true;
			for(int j=0; j<c.length; j++) {
				if(c[j]>=65 && c[j]<=90) {
					count = !count;
					c[j] += !count ? 32 : 0;
				}System.out.print(c[j]);
			}System.out.println();
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
