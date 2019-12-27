import java.util.*;
import java.io.*;

public class dwite10c3p4 {
	static boolean inbounds(int x, int y) {
		if (x >= 0 && x < 10 && y >= 0 && y < 10) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = 5;
		int xdir[] = { 1, 0, -1, 0 };
		int ydir[] = { 0, 1, 0, -1 };
		while (t-- > 0) {
			boolean grid[][] = new boolean[10][10];
			LinkedList<Integer> firex = new LinkedList<Integer>();
			LinkedList<Integer> firey = new LinkedList<Integer>();
			for (int i = 0; i < 10; i++) {
				String s = sc.next();
				for (int j = 0; j < 10; j++) {
					if (s.charAt(j) == 'T') {
						grid[i][j] = true;
					}
					if (s.charAt(j) == 'F') {
						firex.add(i);
						firey.add(j);
					}
				}
			}
			String useless = sc.next();

			int steps[][] = new int[10][10];
			for (int i = 0; i < 10; i++) {
				Arrays.fill(steps[i], 1 << 30);
			}

			for (int i = 0; i < firex.size(); i++) {
				LinkedList<Integer> x = new LinkedList<Integer>();
				LinkedList<Integer> y = new LinkedList<Integer>();
				x.add(firex.get(i));
				y.add(firey.get(i));
				steps[firex.get(i)][firey.get(i)] = 0;

//				System.out.println(firex.get(i)+" "+firey.get(i));

				while (!x.isEmpty()) {
					int x1 = x.poll();
					int y1 = y.poll();
//					System.out.println(x1 + " " + y1);
					for (int j = 0; j < 4; j++) {
						if (inbounds(x1 + xdir[j], y1 + ydir[j]) && grid[x1 + xdir[j]][y1 + ydir[j]]
								&& steps[x1 + xdir[j]][y1 + ydir[j]] > steps[x1][y1] + 1) {
							steps[x1 + xdir[j]][y1 + ydir[j]] = steps[x1][y1] + 1;
							x.add(x1 + xdir[j]);
							y.add(y1 + ydir[j]);
						}
					}
				}

			}

			int max = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
//					System.out.print(steps[i][j] == 1 << 30 ? 0 : steps[i][j]);
					if (grid[i][j]) {
						max = Math.max(max, steps[i][j]);
					}
				}
//				System.out.println();
			}

			System.out.println(max == 1 << 30 ? -1 : max);

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
