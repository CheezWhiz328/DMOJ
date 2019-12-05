import java.util.*;
import java.io.*;

public class ccc14s4 {

	static class row implements Comparable<row> {
		int xl;
		int xr;
		int y;
		int tint;

		public row(int X1, int Y, int Xr, int T) {
			tint = T;
			y = Y;
			xl = X1;
			xr = Xr;
		}

		public int compareTo(row o) {
			return y - o.y;
		}
	}

	static class column implements Comparable<column> {
		int y;
		int tint;

		public column(int Y, int T) {
			y = Y;
			tint = T;
		}

		public int compareTo(column o) {
			return y - o.y;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int tint = sc.nextInt();

		int MAX = 2005;
		row row[] = new row[n * 2];

		for (int i = 0; i < n; i++) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), t = sc.nextInt();
			row[i * 2] = new row(x1, y1, x2, t);
			row[i * 2 + 1] = new row(x1, y2, x2, -t);

		}

		Arrays.sort(row, 0, n * 2);
		ArrayList<column> point = new ArrayList<column>();

		long count = 0;
		for (int i = 0; i < n * 2 - 1; i++) {
			point.add(new column(row[i].xl, row[i].tint));
			point.add(new column(row[i].xr, -row[i].tint));
			Collections.sort(point);
			int count1 = 0;
			for (int j = 0; j < point.size() - 1; j++) {
//				System.out.print(row[j].tint + " ");
				count1 += point.get(j).tint;
				if (count1 >= tint) {
					count += 1L * (point.get(j + 1).y - point.get(j).y) * (row[i + 1].y - row[i].y);
				}
			}
//			System.out.println();
//			System.out.println(count);
		}

		System.out.println(count);

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
