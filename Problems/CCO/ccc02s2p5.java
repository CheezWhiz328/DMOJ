import java.util.*;
import java.io.*;

public class ccc02s2p5 {

	static double eucdis(int x, int y, int x2, int y2) {
		return Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
	}

	static class path implements Comparable<path> {
		int node, parent;
		double dist;

		path(double _dist, int _node, int _parent) {
			dist = _dist;
			node = _node;
			parent = _parent;
		}

		public int compareTo(path other) {
			double diff = dist - other.dist;
			if (diff < 0)
				return -1;
			if (diff > 0)
				return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader(System.in);
		int n = sc.nextInt();
		int MAX = 805;
		int x[] = new int[MAX];
		int y[] = new int[MAX];
		ArrayList<Integer> edges[] = new ArrayList[MAX];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			edges[i] = new ArrayList<Integer>();
		}

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			edges[a].add(b);
			edges[b].add(a);
		}
		PriorityQueue<path> pq = new PriorityQueue<path>();
		pq.add(new path(0.0, 0, 0));
		boolean visited[] = new boolean[1005];
		ArrayList<path> print = new ArrayList<path>();

		double count = 0;
		while (!pq.isEmpty()) {
			path current = pq.poll();
			int N = current.node;
			int P = current.parent;
			double D = current.dist;
			if (!visited[N]) {
				count += D;
				print.add(current);
				visited[N] = true;
				for (int i = 0; i < n; i++) {
					if (!visited[i]) {
						pq.add(new path(eucdis(x[N], y[N], x[i], y[i]), i, N));
					}
				}
				for (int i = 0; i < edges[N].size(); i++) {
					int next = edges[N].get(i);
					if (!visited[next]) {
						pq.add(new path(0, next, N));
					}
				}
			}
		}

		System.out.printf("%.2f\n", count);
		for (int i = 1; i < n; i++) {
			if (print.get(i).dist != 0) {
				System.out.println((print.get(i).node + 1) + " " + (print.get(i).parent + 1));
			}
		}
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader(InputStream x) {
			br = new BufferedReader(new InputStreamReader(x));

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