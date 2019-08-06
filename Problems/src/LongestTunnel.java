import java.util.*;
import java.io.*;

public class LongestTunnel {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		int max = 0;
		while(--N>=0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			max = Math.max(max, b-a);
		}System.out.println(max);
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
