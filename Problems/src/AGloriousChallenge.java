import java.util.*;
import java.io.*;

public class AGloriousChallenge {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int max1 = -1;
		int max2 = -1;
		int min1 = 1 << 30;
		int min2 = 1 << 30;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			max1 = Math.max(max1, a+i);
			max2 = Math.max(max2, a-i);
			min1 = Math.min(min1, a+i);
			min2 = Math.min(min2, a-i);
		}System.out.println(Math.max(max1-min1, max2-min2));
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
