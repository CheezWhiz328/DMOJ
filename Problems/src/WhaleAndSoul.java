import java.util.*;
import java.io.*;

public class WhaleAndSoul {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] a1 = new int[n];
		for(int i=0; i < n; i++) {
			a1[i] = sc.nextInt();
			a[i] = sc.nextInt();
		}
		int max = 0;
		for(int i=0; i < n; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		int min = 1 << 30;
		for(int i=0; i < n; i++) {
			if(a1[i] < min && max == a[i]) {
				min = a1[i];
			}
		}
		System.out.println(min+" "+max);
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
