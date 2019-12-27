import java.io.*;
import java.util.*;

public class vmss7wc15c4p3 {
	static int[] dijkstra(int start, ArrayList<edge>[] adj) {
		int[] dis = new int[300005];
		Arrays.fill(dis, 1 << 30);
		PriorityQueue<edge> pq = new PriorityQueue<>();
		pq.add(new edge(start, 0));
		dis[start] = 0;
		while (!pq.isEmpty()) {
			edge cur = pq.poll();
			for (edge e : adj[cur.dis]) {
				int curdis = e.dis;
				int curw = e.w;
				if (dis[curdis] > dis[cur.dis] + curw) {
					dis[curdis] = dis[cur.dis] + curw;
					pq.add(new edge(curdis, curw));
				}
			}
		}
		return dis;
	}

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

	public static void main(String[] Args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt(), m = sc.nextInt();

		ArrayList<edge>[] adj = new ArrayList[100005];
		for (int i = 0; i < 100005; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int t = sc.nextInt();
			adj[a].add(new edge(b, t));
			adj[b].add(new edge(a, t));

		}
		int dis[] = dijkstra(0, adj);
		int dis1[] = dijkstra(n - 1, adj);
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dis[i] + dis1[i]);
		}
		System.out.println(max);
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