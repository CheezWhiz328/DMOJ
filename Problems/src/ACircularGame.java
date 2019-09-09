import java.util.*;
import java.io.*;

public class ACircularGame {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		long min = 1 << 60L;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0; j < N; j++) {

				count += Math.min(Math.abs(arr[i] - arr[j]),
						Math.min(Math.abs((arr[i] + M) - arr[j]), Math.abs(arr[i] - (arr[j] + M))));
			}
			if (count < min) {
				min = count;
			}
		}
		System.out.println(min);
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
