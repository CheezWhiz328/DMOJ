import java.io.*;
import java.util.*;

public class modulosort {
	static class edge implements Comparable<edge> {
		int dis;
		int w;

		edge(int dis1, int w1) {
			dis = dis1;
			w = w1;
		}

		public int compareTo(edge o) {
			return w - o.w;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int k = sc.nextInt();
		edge arr[] = new edge[n];
		int jank[] = new int[n];
		for (int i = 0; i < n; i++) {
			jank[i] = sc.nextInt();
		}

		Arrays.sort(jank);
		for (int i = 0; i < n; i++) {
			arr[i] = new edge(jank[i], jank[i] % k);
		}

		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i].dis + " ");
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
