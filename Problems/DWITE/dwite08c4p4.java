import java.util.*;
import java.io.*;

public class dwite08c4p4 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		for (int t = 0; t < 5; t++) {
			char arr[][] = new char[8][8];
			int BR = 0;
			int BC = 0;
			int ER = 0;
			int EC = 0;
			for (int i = 0; i < 8; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = s.charAt(j);
					if (arr[i][j] == 'A') {
						BR = i;
						BC = j;
					}
					if (arr[i][j] == 'B') {
						ER = i;
						EC = j;
					}
				}
			}
			int[][] step = new int[8][8];
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					step[i][j] = 1<<30;
				}
			}

			LinkedList<Integer> rowQ = new LinkedList<Integer>();
			LinkedList<Integer> colQ = new LinkedList<Integer>();

			rowQ.add(BR);
			colQ.add(BC);
			step[BR][BC] = 0;

			// Start BFS

			while (!rowQ.isEmpty()) {
				int R = rowQ.poll();
				int C = colQ.poll();
//				System.out.println(R+" "+C);

				if (R - 1 >= 0 && step[R - 1][C] > step[R][C] + 1 && arr[R - 1][C] != '#') {
					step[R - 1][C] = step[R][C] + 1;
					rowQ.add(R - 1);
					colQ.add(C);
				}
				if (R + 1 < 8 && step[R + 1][C] > step[R][C] + 1 && arr[R + 1][C] != '#') {
					step[R + 1][C] = step[R][C] + 1;
					rowQ.add(R + 1);
					colQ.add(C);
				}
				if (R - 1 >= 0 && C - 1 >= 0 && step[R - 1][C - 1] > step[R][C] + 1 && arr[R - 1][C - 1] != '#') {
					step[R - 1][C - 1] = step[R][C] + 1;
					rowQ.add(R - 1);
					colQ.add(C - 1);
				}
				if (R + 1 < 8 && C + 1 < 8 && step[R + 1][C + 1] > step[R][C] + 1 && arr[R + 1][C + 1] != '#') {
					step[R + 1][C + 1] = step[R][C] + 1;
					rowQ.add(R + 1);
					colQ.add(C + 1);
				}
				if (C + 1 < 8 && step[R][C + 1] > step[R][C] + 1 && arr[R][C + 1] != '#') {
					step[R][C + 1] = step[R][C] + 1;
					rowQ.add(R);
					colQ.add(C + 1);
				}
				if (C - 1 >= 0 && step[R][C - 1] > step[R][C] + 1 && arr[R][C - 1] != '#') {
					step[R][C - 1] = step[R][C] + 1;
					rowQ.add(R);
					colQ.add(C - 1);
				}

				if (R + 1 < 8 && C - 1 >= 0 && step[R + 1][C - 1] > step[R][C] + 1 && arr[R + 1][C - 1] != '#') {
					step[R + 1][C - 1] = step[R][C] + 1;
					rowQ.add(R + 1);
					colQ.add(C - 1);
				}
				if (R - 1 >= 0 && C + 1 < 8 && step[R - 1][C + 1] > step[R][C] + 1 && arr[R - 1][C + 1] != '#') {
					step[R - 1][C + 1] = step[R][C] + 1;
					rowQ.add(R - 1);
					colQ.add(C + 1);
				}
			}
//			for(int i=0; i<8; i++) {
//				for(int j=0; j<8; j++) {
//					System.out.print(step[i][j]+" ");
//				}System.out.println();
//			}
			System.out.println(step[ER][EC]);
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
