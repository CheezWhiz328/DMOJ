import java.util.*;
import java.io.*;

public class StrayingFromGodsLight {

	public static void main(String args[]) throws IOException {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		long[][] step = new long[a][a];
		boolean[][] val = new boolean[a][a];
		long max = 1 << 60L;
		for (int row = 0; row < a; row++) {
			String s = sc.next();
			for (int col = 0; col < a; col++) {
				step[row][col] = max;
				val[row][col] = s.charAt(col) == '.' ? true : false;
			}
		}

		int BR = 0; // BR = beginning row number
		int BC = 0; // BC = beginning col number
		int ER = a - 1; // ER = ending row number
		int EC = a - 1; // EC = ending col number

		LinkedList<Integer> rowQ = new LinkedList<Integer>();
		LinkedList<Integer> colQ = new LinkedList<Integer>();

		rowQ.add(BR);
		colQ.add(BC);
		step[BR][BC] = 0;

		// Start BFS

		while (!rowQ.isEmpty()) {
			int R = rowQ.poll();
			int C = colQ.poll();

			if (R + 1 < a && step[R + 1][C] > step[R][C] + 1 && val[R + 1][C]) {
				step[R + 1][C] = step[R][C] + 1;
				rowQ.add(R + 1);
				colQ.add(C);
			}

			if (C + 1 < a && step[R][C + 1] > step[R][C] + 1 && val[R][C + 1]) {
				step[R][C + 1] = step[R][C] + 1;
				rowQ.add(R);
				colQ.add(C + 1);
			}

			if (C - 1 >= 0 && step[R][C - 1] > step[R][C] + 1 && val[R][C - 1]) {
				step[R][C - 1] = step[R][C] + 1;
				rowQ.add(R);
				colQ.add(C - 1);
			}

		}

//		for (int row = 0; row < a; row++) {
//			for (int col = 0; col < a; col++) {
//				System.out.print(step[row][col] != max ? "  " + step[row][col] + " " : 100 + " ");
//			}
//			System.out.println();
//		}
//		System.out.println(step[ER][EC]);
		long x = step[ER][EC] / 2 - a + 1;
		long d = a - 1;
		long r = x;
		long l = a - 1 + x;
		System.out.println(step[ER][EC] != max ? d * d + r * r + l * l : -1);

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