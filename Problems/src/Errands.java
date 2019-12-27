import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Errands {
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();

		int V = sc.nextInt();
		int E = sc.nextInt();
		int q = sc.nextInt();
		int z = sc.nextInt() - 1;

		boolean[][] map = new boolean[V][V];
		for (int i = 0; i < E; i++) {
			int bv = sc.nextInt() - 1;
			int ev = sc.nextInt() - 1;
			map[bv][ev] = true;
			map[ev][bv] = true;
		}
		long[][] ans = new long[V][V];
		for (int i = 0; i < V; i++) {
			long[] step = new long[V];
			Arrays.fill(step, 1 << 60l);

			LinkedList<Integer> queue = new LinkedList<Integer>();

			step[i] = 0;
			queue.add(i);

			while (!queue.isEmpty()) {
				int cur = queue.poll();

				for (int c = 0; c < V; c++) {
					if (map[cur][c] == true && step[c] > step[cur] + 1) {
						step[c] = step[cur] + 1;
						queue.add(c);
					}
				}
			}
			for (int j = 0; j < V; j++) {
				ans[i][j] = step[j];
			}
		}

		while (q-- > 0) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			System.out.println(ans[z][a] < 1 << 59l || ans[z][b] < 1 << 59l ? ans[z][a] + ans[z][b] : "This is a scam!");
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