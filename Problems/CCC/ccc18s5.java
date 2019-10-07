import java.util.*;
import java.io.*;

public class ccc18s5 {
	static int MAX = 100005;

	public static class edge implements Comparable<edge> {
		int x, y, cost, type;

		public edge(int _x, int _y, int _cost, int _type) {
			x = _x;
			y = _y;
			cost = _cost;
			type = _type;
		}

		public int compareTo(edge o) {
			return cost - o.cost;
		}
	}

	public static int[] parRow = new int[MAX];
	public static int[] parCol = new int[MAX];
	public static int[] sizeRow = new int[MAX];
	public static int[] sizeCol = new int[MAX];
	public static edge edgelist[] = new edge[MAX * 2];

	static int getRootRow(int x) {
		while (x != parRow[x]) {
			x = parRow[x];
		}
		return x;
	}

	static int getRootCol(int x) {
		while (x != parCol[x]) {
			x = parCol[x];
		}
		return x;
	}

	static boolean mergeRow(int x, int y) {
		x = getRootRow(x);
		y = getRootRow(y);
		if (x == y) {
			return false;
		}
		if (sizeRow[x] < sizeRow[y]) {
			return mergeRow(y, x);
		}
		parRow[y] = x;
		sizeRow[x] += sizeRow[y];
		return true;
	}

	static boolean mergeCol(int x, int y) {
		x = getRootCol(x);
		y = getRootCol(y);
		if (x == y) {
			return false;
		}
		if (sizeCol[x] < sizeCol[y]) {
			return mergeCol(y, x);
		}
		parCol[y] = x;
		sizeCol[x] += sizeCol[y];
		return true;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		long ogcost = 0;

		for (int i = 1; i <= n; i++) {
			parRow[i] = i;
			sizeRow[i] = 1;
		}

		for (int i = 1; i <= m; i++) {
			parCol[i] = i;
			sizeCol[i] = 1;
		}

		for (int i = 0; i < p; i++) {
			edgelist[i] = new edge(sc.nextInt(), sc.nextInt(), sc.nextInt(), 0);
			ogcost += 1L * edgelist[i].cost * n;
		}

		for (int i = 0; i < q; i++) {
			edgelist[p + i] = new edge(sc.nextInt(), sc.nextInt(), sc.nextInt(), 1);
			ogcost += 1L * edgelist[p + i].cost * m;
		}

		Arrays.sort(edgelist, 0, p + q);
		long count = 0;
		int rowg = n;
		int colg = m;
		for (int i = 0; i < p + q; i++) {
			int x = edgelist[i].x;
			int y = edgelist[i].y;
			int cost = edgelist[i].cost;
			int type = edgelist[i].type;
			if (type == 0) {
				if (mergeCol(x, y)) {
					count += 1L * cost * rowg;
					colg--;
				}
			} else {
				if (mergeRow(x, y)) {
					count += 1L * cost * colg;
					rowg--;
				}
			}
		}
//		System.out.println(ogcost + " " +count);
		System.out.println(ogcost - count);
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
