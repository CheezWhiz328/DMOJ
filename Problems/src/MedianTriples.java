import java.util.*;
import java.io.*;

public class MedianTriples {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i <= a - 3; i++) {
			for (int j = i + 1; j <= a - 2; j++) {
				for (int k = j + 1; k <= a - 1; k++) {
//					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					if (arr[j] == x) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
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