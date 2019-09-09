import java.util.*;
import java.io.*;

public class ctuopen2017a {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		while (sc.nextLine() != null) {
			String[] arr = sc.nextLine().split(" ");
			int count = 1;
			for (int j = arr.length - 1; j >= 2; j--) {
				if (Integer.parseInt(arr[j]) - Integer.parseInt(arr[j - 1]) != Integer.parseInt(arr[j - 1])
						- Integer.parseInt(arr[j - 2])) {
					count = j;
					break;
				}
			}
			System.out.println(count);
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