import java.util.*;
import java.io.*;

public class battlePositions {

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();

		int I = sc.nextInt();
		int N = sc.nextInt();
		int J = sc.nextInt();
		int a[] = new int[100005], count = 0;
		for (int i = 0; i < J; i++) {
			int x = sc.nextInt();
			int x1 = sc.nextInt();
			int k = sc.nextInt();
			a[x] += k;
			a[x1 + 1] -= k;
		}
		if (a[0] < N) {
			count++;
		}
		for (int i = 1; i < I; i++) {
			a[i] += a[i - 1];
			if (a[i] < N)
				count++;
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
