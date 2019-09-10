import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ds2 {
	public static Edge[] edge;
	public static int[] parent;
	public static int[] mst;

	public static class Edge {
		int bv;
		int ev;
	}

	public static int find(int n) {
		if (parent[n] != n) {
			parent[n] = find(parent[n]);
		}

		return parent[n];
	}

	public static void union(int n1, int n2) {
		parent[n1] = n2;
	}

	public static void main(String[] args) throws IOException {
		// TODO code application logic here
		Reader sc = new Reader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		edge = new Edge[m];
		for (int i = 0; i < m; i++) {
			edge[i] = new Edge();
			edge[i].bv = sc.nextInt() - 1;
			edge[i].ev = sc.nextInt() - 1;
		}
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
		int count = 0;
		mst = new int[m];
		for (int i = 0; i < m; i++) {
			int bv = edge[i].bv;
			int ev = edge[i].ev;
			int pb = find(bv);
			int pe = find(ev);
			if (pb != pe) {
				union(pb, pe);
				mst[count] = i + 1;
				count++;
			}
			if (count == n - 1) {
				break;
			}
		}
		if (count == n - 1) {
			for (int i = 0; i < mst.length; i++) {
				if (mst[i] != 0)
					System.out.println(mst[i]);
			}
		} else
			System.out.println("Disconnected Graph");
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