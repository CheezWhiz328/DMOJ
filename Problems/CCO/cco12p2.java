import java.util.*;
import java.io.*;

public class cco12p2 {
	static int n;

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

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		n = sc.nextInt();
		ArrayList<edge>[] adj = new ArrayList[n];
		ArrayList<edge>[] adj1 = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayList<edge>();
			adj1[i] = new ArrayList<edge>();
		}

		int m = sc.nextInt();
		int bad[][] = new int[m][3];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			adj[a].add(new edge(b, c));
			adj1[b].add(new edge(a, c));
			bad[i][0] = a;
			bad[i][1] = b;
			bad[i][2] = c;
		}

		int arr[] = dijkstra(0, adj);
		int arr1[] = dijkstra(n - 1, adj1);

		int shortest = arr[n - 1];
		int ans = 1 << 30;

		for (int i = 0; i < m; i++) {
			int path = arr[bad[i][0]] + arr1[bad[i][1]] + bad[i][2];

			if (path > shortest) {
				ans = Math.min(ans, path);
			}
		}

		System.out.println(ans != 1 << 30 ? ans : -1);
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