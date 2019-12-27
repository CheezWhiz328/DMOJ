import java.util.*;
import java.io.*;

public class dmpg15s2 {
	static class coor {
		int x;
		int x1;
		int y;
		int y1;

		coor(int X, int X1, int Y, int Y1) {
			x = X;
			x1 = X1;
			y = Y;
			y1 = Y1;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int r = sc.nextInt();
		int n = sc.nextInt();
		coor arr[] = new coor[r];
		for (int i = 0; i < r; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x1 = x + sc.nextInt() - 1;
			int y1 = y + sc.nextInt() - 1;
			arr[i] = new coor(x, x1, y, y1);
		}
		boolean vis[] = new boolean[r];
		for (int i = 0; i < n; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			for (int j = 0; j < r; j++) {
				if (!vis[j]) {
					coor coor = arr[j];
					int x = coor.x;
					int x1 = coor.x1;
					int y = coor.y;
					int y1 = coor.y1;
					System.out.println(x + " " + x1 + " " + y + " " + y1);
					if (X >= x && X <= x1 && Y >= y && Y <= y1) {
						vis[j] = true;
					}
				}
			}
		}

		int count = 0;
		for (int i = 0; i < r; i++) {
			if (vis[i]) {
				count++;
			}
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
