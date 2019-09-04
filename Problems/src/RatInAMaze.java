import java.util.LinkedList;
import java.util.Scanner;

public class RatInAMaze {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int max = 1 << 30;
		int a = sc.nextInt();
		int[][] step = new int[a][a];
		boolean[][] val = new boolean[a][a];
		for (int row = 0; row < a; row++) {

			for (int col = 0; col < a; col++) {
				int s = sc.nextInt();
				step[row][col] = max;
				val[row][col] = s == 0 ? true : false;
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

		while (!rowQ.isEmpty()) {
			int R = rowQ.poll();
			int C = colQ.poll();

			if (R + 1 < a && step[R + 1][C] > step[R][C] + 1 && val[R + 1][C]) {
				step[R + 1][C] = step[R][C] + 1;
				rowQ.add(R + 1);
				colQ.add(C);
			}

			if (R - 1 >= 0 && step[R - 1][C] > step[R][C] + 1 && val[R - 1][C]) {
				step[R - 1][C] = step[R][C] + 1;
				rowQ.add(R - 1);
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

		for (int row = 0; row < a; row++) {
			for (int col = 0; col < a; col++) {
				System.out.print(step[row][col]);
			}
			System.out.println();
		}
		System.out.println(step[ER][EC] != max ? "yes" : "no");

	}
}