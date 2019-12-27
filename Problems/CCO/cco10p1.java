import java.util.*;
import java.io.*;

public class cco10p1 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int d = sc.nextInt();
		int MAX = 1005;
		int dogs[] = new int[MAX];
		for (int i = 1; i <= d; i++) {
			dogs[i] = sc.nextInt();
		}

		ArrayList<Integer> connect[] = new ArrayList[MAX];
		ArrayList<Integer> times[] = new ArrayList[MAX];
		for (int i = 0; i < connect.length; i++) {
			connect[i] = new ArrayList<Integer>();
			times[i] = new ArrayList<Integer>();
		}
		int f = sc.nextInt();
		while (f-- > 0) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			connect[i].add(j);
		}
		int t = sc.nextInt();

		boolean inactive[] = new boolean[MAX];
		int count[] = new int[MAX];

		times[0].add(1);
		for (int i = 0; i <= t; i++) {
			for (int j : times[i]) {
//				System.out.println(j);
				count[j]++;
				for (int next : connect[j]) {
					if (i + dogs[next] <= t && !inactive[next]) {
						times[i + dogs[next]].add(next);
						inactive[next] = true;
					}

				}
			}
			for (int l : times[i]) {
				inactive[l] = false;
			}
		}

		for (int i = 1; i <= d; i++) {
			System.out.println(count[i]);
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
