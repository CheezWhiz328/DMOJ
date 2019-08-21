import java.util.*;
import java.io.*;

public class PennyGame {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for (int t = 0; t < 5; t++) {
			int a = sc.nextInt();
			int arr[] = new int[a];
			for (int i = 0; i < a; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int count = 0;
			while (arr[0] != arr[a - 1]) {
				arr[a - 1]--;
				arr[0]++;
				count++;
				Arrays.sort(arr);
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
