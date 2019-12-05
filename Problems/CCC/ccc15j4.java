import java.util.*;
import java.io.*;

public class ccc15j4 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int MAX = 101;
		int fin[] = new int[MAX];
		int reply[] = new int[MAX];
		int sent[] = new int[MAX];

		int m = sc.nextInt();
		int t = 0;
		while (m-- > 0) {
			char c = sc.next().charAt(0);
			int x = sc.nextInt();
			if (c == 'W') {
				t += x - 2;

			} else if (c == 'R') {
				sent[x] = t;
				reply[x] = -1;
			} else {
				reply[x] = 1;
				fin[x] -= sent[x] - t;
			}

			t++;
		}

//		why am i like this
		while (--MAX >= 0) {
			int i = 101 - MAX - 1;
			if (reply[i] != 0) {
				System.out.println(reply[i] > 0 ? i + " " + fin[i] : i + " " + reply[i]);
			}
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
