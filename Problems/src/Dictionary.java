import java.util.*;
import java.io.*;

public class Dictionary {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		String[] arr = new String[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		System.out.print(arr[0]);
		for (int i = 1; i < a; i++) {
			if (arr[i].charAt(0) == arr[i - 1].charAt(0)) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
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
