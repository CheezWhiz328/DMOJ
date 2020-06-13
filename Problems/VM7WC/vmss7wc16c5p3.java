import java.io.*;
import java.util.*;

public class vmss7wc16c5p3 {
	static ArrayList<edge> adj[] = new ArrayList[10005];

	static class edge implements Comparable<edge> {
		int dis;
		int w;

		edge(int dis1) {
			dis = dis1;
			w = 1;
		}

		public int compareTo(edge o) {
			return w - o.w;
		}
	}

	static int last = 0;

	static int[] bfs(int start) {
		int[] dis = new int[10005];
		Arrays.fill(dis, 1 << 30);
		LinkedList<edge> q = new LinkedList<edge>();
		q.add(new edge(start));
		dis[start] = 0;
		while (!q.isEmpty()) {
			edge cur = q.poll();
			last = cur.dis;
			for (edge e : adj[cur.dis]) {
				int curdis = e.dis;
				if (dis[curdis] > dis[cur.dis] + 1) {
					dis[curdis] = dis[cur.dis] + 1;
					q.add(new edge(curdis));
				}
			}
		}
		return dis;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();

		for (int i = 0; i < 10005; i++) {
			adj[i] = new ArrayList<edge>();
		}

		int first = 0;
		for (int i = 0; i < n - 1; i++) {
			int x = sc.nextInt();
			if (i == 0) {
				first = x;
			}
			int y = sc.nextInt();
			adj[x].add(new edge(y));
			adj[y].add(new edge(x));
		}

		bfs(first);

		int arr[] = bfs(last);
		System.out.println(arr[last]);

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
