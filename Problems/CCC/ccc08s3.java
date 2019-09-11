import java.util.LinkedList;
import java.util.Scanner;

public class ccc08s3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int max = 1 << 30;
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			int[][] step = new int[r][c];
			char[][] maze = new char[r][c];
			for (int row = 0; row < r; row++) {
				String s = sc.next();
				for (int col = 0; col < c; col++) {
					step[row][col] = 1 << 30;
					maze[row][col] = s.charAt(col);
				}
			}

			int BR = 0; // BR = beginning row number
			int BC = 0; // BC = beginning col number
			int ER = r - 1; // ER = ending row number
			int EC = c - 1; // EC = ending col number

			LinkedList<Integer> rowQ = new LinkedList<Integer>();
			LinkedList<Integer> colQ = new LinkedList<Integer>();

			rowQ.add(BR);
			colQ.add(BC);
			step[BR][BC] = 1;

			while (!rowQ.isEmpty()) {
				int R = rowQ.poll();
				int C = colQ.poll();

				if (maze[R][C] == '+') {
					if (R + 1 < r && step[R + 1][C] > step[R][C] + 1 && maze[R + 1][C] != '*') {
						step[R + 1][C] = step[R][C] + 1;
						rowQ.add(R + 1);
						colQ.add(C);
					}

					if (R - 1 >= 0 && step[R - 1][C] > step[R][C] + 1 && maze[R - 1][C] != '*') {
						step[R - 1][C] = step[R][C] + 1;
						rowQ.add(R - 1);
						colQ.add(C);
					}

					if (C + 1 < c && step[R][C + 1] > step[R][C] + 1 && maze[R][C + 1] != '*') {
						step[R][C + 1] = step[R][C] + 1;
						rowQ.add(R);
						colQ.add(C + 1);
					}

					if (C - 1 >= 0 && step[R][C - 1] > step[R][C] + 1 && maze[R][C - 1] != '*') {
						step[R][C - 1] = step[R][C] + 1;
						rowQ.add(R);
						colQ.add(C - 1);
					}
				}

				if (maze[R][C] == '|') {
					if (R + 1 < r && step[R + 1][C] > step[R][C] + 1 && maze[R + 1][C] != '*') {
						step[R + 1][C] = step[R][C] + 1;
						rowQ.add(R + 1);
						colQ.add(C);
					}

					if (R - 1 >= 0 && step[R - 1][C] > step[R][C] + 1 && maze[R - 1][C] != '*') {
						step[R - 1][C] = step[R][C] + 1;
						rowQ.add(R - 1);
						colQ.add(C);
					}
				}

				if (maze[R][C] == '-') {
					if (C + 1 < c && step[R][C + 1] > step[R][C] + 1 && maze[R][C + 1] != '*') {
						step[R][C + 1] = step[R][C] + 1;
						rowQ.add(R);
						colQ.add(C + 1);
					}

					if (C - 1 >= 0 && step[R][C - 1] > step[R][C] + 1 && maze[R][C - 1] != '*') {
						step[R][C - 1] = step[R][C] + 1;
						rowQ.add(R);
						colQ.add(C - 1);
					}
				}

			}

//			for (int row = 0; row < r; row++) {
//				for (int col = 0; col < c; col++) {
//					System.out.print((step[row][col] != max ? step[row][col] : 0) + " ");
//				}
//				System.out.println();
//			}
			System.out.println(step[ER][EC] != max ? step[ER][EC] : -1);

		}

	}
}