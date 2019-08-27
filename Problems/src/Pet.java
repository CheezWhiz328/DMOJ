import java.util.*;
import java.io.*;

public class Pet {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i] += sc.nextInt();
			}
		}
		int max = 0;
		int ind = -1;
		for (int i = 0; i < 5; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ind = i;
			}
		}
		System.out.println((ind + 1) + " " + max);
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
