import java.util.*;
import java.io.*;

public class The365DaysOfChristmas {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		LinkedList<String> b = new LinkedList<String>();
		for (int i = 1; i <= a; i++) {
			b.add(sc.nextLine());
			if (i % 10 == 1 && i != 11 && i != 111 && i != 211 && i != 311) {
				System.out.println("On the " + i + "st day of Christmas my true love sent to me:");
			} else if (i % 10 == 2 && i != 12 && i != 112 && i != 212 && i != 312) {
				System.out.println("On the " + i + "nd day of Christmas my true love sent to me:");
			} else if (i % 10 == 3 && i != 13 && i != 113 && i != 213 && i != 313) {
				System.out.println("On the " + i + "rd day of Christmas my true love sent to me:");
			} else {
				System.out.println("On the " + i + "th day of Christmas my true love sent to me:");
			}

			for (int j = b.size() - 1; j >= 0; j--) {
				if (j == 0 && i != 1) {
					System.out.println("and " + (j + 1) + " " + b.get(j));
				} else {
					System.out.println(j + 1 + " " + b.get(j));
				}

			}
			System.out.println();
		}
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