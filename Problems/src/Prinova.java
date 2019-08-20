import java.util.*;
import java.io.*;

public class Prinova {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int a = sc.nextInt();
		a = a % 2 == 0 ? ++a : a;
		int b = sc.nextInt();
		int x = -1;
		int ind = 0;
		for(int i=a; i<=b; i+=2) {
			int min = 1 << 30;
			for(int j=0; j<n; j++) {
				min = Math.min(min, Math.abs(arr[j]-i));
			}
			if(min>x) {
				x = min;
				ind = i;
			}
		}System.out.println(ind);
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
