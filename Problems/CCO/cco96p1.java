import java.util.*;
import java.io.*;

public class cco96p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();

		while (n-- > 0) {
			int l = sc.nextInt();
			int arr[] = new int[l + 1];

			for (int i = 1; i <= l; i++) {
				arr[i] = sc.nextInt();
			}

			int count = 0;

			while (true) {
				boolean flag = true;
				for (int i = 1; i <= l; i++) {
					if (arr[i] != i) {
						flag = false;
					}
				}

				if (flag) {
					System.out.println("Optimal train swapping takes" + " " + count + " " + "swaps.");
					break;
				}

				for (int i = 1; i <= l; i++) {
					if (arr[i] < arr[i - 1]) {
						int temp = arr[i];
						arr[i] = arr[i - 1];
						arr[i - 1] = temp;
						count++;
						break;
					}
				}
			}
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
