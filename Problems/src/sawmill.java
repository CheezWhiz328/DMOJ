import java.util.*;
import java.io.*;

public class sawmill {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr1.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			arr2.add(sc.nextInt());
		}
		Collections.sort(arr1);
		Collections.sort(arr2);
		long count = 0;
		for (int i = 0; i < n; i++) {
			count += arr1.get(i) * arr2.get(n - i - 1);
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
