import java.util.*;
import java.io.*;

public class Pulse {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			m *= 2;
			if(m>=a && m<=b) {
				count++;
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
