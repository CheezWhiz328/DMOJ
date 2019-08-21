import java.util.*;
import java.io.*;

public class WowMuchParkingLot {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int x = 0;
		int y = 0;
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			int c = sc.nextInt();
			if (b.charAt(0) == 'N') {
				y += c;
			} else if (b.charAt(0) == 'S') {
				y -= c;
			} else if (b.charAt(0) == 'W') {
				x -= c;
			} else {
				x += c;
			}
		}
		System.out.println(x + " " + y);
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
