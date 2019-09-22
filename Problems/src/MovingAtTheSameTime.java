import java.util.*;
import java.io.*;

public class MovingAtTheSameTime {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int MAX = 20;
		for (int t = 0; t < 5; t++) {
			char s[] = sc.next().toCharArray();

			int[] pos = new int[MAX];
			int[] vel = new int[MAX];
			boolean[] zero = new boolean[MAX];
			for (int i = 0; i < s.length; i++) {
				if (s[i] == '0') {
					zero[i] = true;
				} else if (s[i] != '.') {
					pos[i] = i;
					vel[i] = s[i] - '0';
				}
			}

			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i]);
			}
			System.out.println();

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < MAX; j++) {
					pos[j] += vel[j];
				}
				int grid[] = new int[MAX];
				for (int j = 0; j < MAX; j++) {
					if (pos[j] < MAX) {
						grid[pos[j]] += vel[j];
					}
				}
				for (int j = 0; j < s.length; j++) {
					System.out.print(grid[j] == 0 && !zero[j] ? "." : grid[j]);
				}
				System.out.println();
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
