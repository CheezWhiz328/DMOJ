import java.util.*;
import java.io.*;

public class ecoo19r3p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		
		for (int i = 0; i < 10; i++) {
			boolean[] arr = new boolean[1000001];
			int N = sc.nextInt();

			int max = 0;
			for (int j = 0; j < N; j++) {
				int a = sc.nextInt();
				arr[a] = true;
				if (a > max) {
					max = a;
				}
			}
			int count = 0;
			for (int j = 1; j <= max; j++) {
				if (arr[j]) {
					for (int k = 2 * j; k <= max; k += j) {
						if (arr[k])
							count++;
					}
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