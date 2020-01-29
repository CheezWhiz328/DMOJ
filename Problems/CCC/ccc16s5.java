import java.util.*;
import java.io.*;

public class ccc16s5 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();

		long t = sc.nextLong();

		int arr[] = new int[n];
		String s = sc.next();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i) - '0';
		}

		for (int MAX = 50; MAX >= 0; MAX--) {
			if (((t >> MAX) & 1) == 1) {
				int arr1[] = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					int pos = (int) ((1L * 1 << MAX) % n);
					arr1[i] = arr[(i + pos) % n] ^ arr[(i + n - pos) % n];

				}
				arr = arr1.clone();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
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
