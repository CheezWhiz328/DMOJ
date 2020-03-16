import java.util.*;
import java.io.*;

public class ncco4d1p3 {
	static int n;
	static ArrayList<edge>[] adj = new ArrayList[5005];

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

	static void dijkstra(int start, int dis[]) {
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

	}

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();

		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
		    adj[i] = new ArrayList<edge>();
	    }

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			adj[a].add(new edge(b, c));
			adj[b].add(new edge(a, c));
		}

		int arr[] = new int[5005];
		int arr1[] = new int[5005];
		Arrays.fill(arr, 1<<30);
		Arrays.fill(arr1, 1<<30);
		
		dijkstra(1, arr);
		dijkstra(n, arr1);

		int shortest = arr[n];
		int ans = 1 << 30;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < adj[i].size(); j++) {

				int path = arr[i] + arr1[adj[i].get(j).dis] + adj[i].get(j).w;

				if (path > shortest) {
					ans = Math.min(ans, path);
				}
			}
		}

		System.out.println(ans);
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}