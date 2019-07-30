import java.util.*;
import java.io.*;

public class PrefixSumArray {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int[] b = new int[a];
		int mod = 1000000000 + 7;
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt() % mod;
		}
		
		int c = sc.nextInt();
		
		for(int i=0; i<c; i++) {
			for(int j=1; j<a; j++) {
				b[j] += b[j-1] % mod;
			}
		}
		
		for(int i = 0; i<a; i++) {
			System.out.print(b[i]+" ");
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
