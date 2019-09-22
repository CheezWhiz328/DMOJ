import java.util.*;
import java.io.*;

public class SnowDay {

	public static void main(String[] args) throws IOException {
		Reader sc = new Reader();
		int n = sc.nextInt(), m = sc.nextInt();
		LinkedList<Integer> q = new LinkedList<Integer>();
		int arr[] = new int[1005];
		ArrayList<Integer> adj[] = new ArrayList[1005], dis[] = new ArrayList[1005];
		for (int i = 1; i <= n; i++) {
			adj[i] = new ArrayList<Integer>();
			dis[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
			adj[a].add(b);
			dis[a].add(d);
			arr[b]++;
		}
		for (int i = 1; i <= n; i++) {
			if (arr[i] == 0) {
				q.push(i);
			}
		}
		ArrayList<Integer> order = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			int node = q.poll();
			for (int next : adj[node]) {
				arr[next]--;
				if (arr[next] == 0) {
					q.push(next);
				}
			}
			order.add(node);
		}

		long distance[] = new long[1005];
		long points[] = new long[1004];

		Arrays.fill(distance, -(1 << 30));
		distance[1] = 0;
		points[1] = 1;
		for (int node : order) {
			for (int i = 0; i < adj[node].size(); i++) {
				int next = adj[node].get(i), len = dis[node].get(i);
				if (distance[node] + len > distance[next]
						|| distance[node] + len == distance[next] && points[node] + 1 > points[next]) {
					distance[next] = distance[node] + len;
					points[next] = points[node] + 1;
				}
			}
		}

		System.out.println(distance[n] < -(1 << 29) || points[n] == 38 ? -1 : distance[n] + " " + points[n]);
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

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
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

		public long nextLong() throws IOException {
			long ret = 0;
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

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

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