import java.util.*;
import java.io.*;

public class CuttingCheeseCosts {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int k = sc.nextInt();
		int[] b = new int[a];
		long count = 0;
		for(int i=0; i<a; i++) {
			int pi = sc.nextInt();
			int di = sc.nextInt();
			int dif = pi-di;
			b[i] = dif;
			count += pi;
		}
		Arrays.sort(b);
		for(int i=a-1; i>a-k-1; i--) {
			count -= b[i];
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
