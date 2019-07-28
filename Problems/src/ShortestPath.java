import java.io.*;
import java.util.*;

public class ShortestPath {

	public static void main(String[] Args) {
		FastReader in = new FastReader();

		PriorityQueue<path> pq = new PriorityQueue<path>();
		int n = in.nextInt(), m = in.nextInt();
		ArrayList<Integer>[] adj = new ArrayList[1005], dist = new ArrayList[1005];
		for (int l = 0; l < 1002; l++) {
			adj[l] = new ArrayList<Integer>();
			dist[l] = new ArrayList<Integer>();
		}
		for (int l = 0; l < m; l++) {
			int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
			adj[a].add(b);
			dist[a].add(c);
		}
		int distance[] = new int[1005];
		Arrays.fill(distance, (1 << 30));
		pq.add(new path(0, 1));
		while (!pq.isEmpty()) {
			path temp = pq.poll();
			int N = temp.n, D = temp.d;
			if (D >= distance[N])
				continue;
			distance[N] = D;
			for (int l = 0; l < adj[N].size(); ++l) {
				pq.add(new path(D + dist[N].get(l), adj[N].get(l)));
			}
		}
		System.out.println(distance[n]);
	}

	static class path implements Comparable<path> {
		int d, n;

		path(int _d, int _n) {
			d = _d;
			n = _n;
		}

		public int compareTo(path other) {
			return d - other.d;
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