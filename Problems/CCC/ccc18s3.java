import java.util.LinkedList;
import java.util.Scanner;

public class ccc18s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] A = new char[N][M];
		for (int r = 0; r < N; r++) {
			String S = sc.next();
			A[r] = S.toCharArray();
		}

		int[][] step = new int[N][M];
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (A[r][c] == 'W')
					step[r][c] = -1;
				else if (A[r][c] == 'C') {
					step[r][c] = -1;
					for (int i = r - 1; i >= 0; i--) {
						if (A[i][c] == 'W')
							break;
						else if (A[i][c] == '.' || A[i][c] == 'S')
							step[i][c] = -1;

					}

					for (int i = r + 1; i < N; i++) {
						if (A[i][c] == 'W')
							break;
						else if (A[i][c] == '.' || A[i][c] == 'S')
							step[i][c] = -1;

					}

					for (int j = c - 1; j >= 0; j--) {
						if (A[r][j] == 'W')
							break;
						else if (A[r][j] == '.' || A[r][j] == 'S')
							step[r][j] = -1;

					}

					for (int j = c + 1; j < M; j++) {
						if (A[r][j] == 'W')
							break;
						else if (A[r][j] == '.' || A[r][j] == 'S')
							step[r][j] = -1;

					}

				}
				if (step[r][c] != -1)
					step[r][c] = Integer.MAX_VALUE;

			}
		}
		LinkedList<Integer> x = new LinkedList<Integer>();
		LinkedList<Integer> y = new LinkedList<Integer>();
		int Sr = 0;
		int Sc = 0;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (A[r][c] == '.') {
					x.add(r);
					y.add(c);
				} else if (A[r][c] == 'S') {
					Sr = r;
					Sc = c;
				}
			}
		}

		if (step[Sr][Sc] != -1)
			step[Sr][Sc] = 0;
		else {
			for (int i = 0; i < x.size(); i++)
				System.out.println(-1);
			return;
		}

		LinkedList<Integer> rowQ = new LinkedList<Integer>();
		LinkedList<Integer> colQ = new LinkedList<Integer>();

		rowQ.add(Sr);
		colQ.add(Sc);

		while (!rowQ.isEmpty()) {
			int r = rowQ.poll();
			int c = colQ.poll();

			if (A[r][c] == '.' || A[r][c] == 'S') {
				if (r - 1 >= 0 && step[r - 1][c] != -1) {
					if (A[r - 1][c] == 'U' || A[r - 1][c] == 'D' || A[r - 1][c] == 'L' || A[r - 1][c] == 'R') {
						if (step[r - 1][c] > step[r][c]) {
							step[r - 1][c] = step[r][c];
							rowQ.add(r - 1);
							colQ.add(c);
						}
					} else {
						if (step[r - 1][c] > step[r][c] + 1) {
							step[r - 1][c] = step[r][c] + 1;
							rowQ.add(r - 1);
							colQ.add(c);
						}
					}

				}
				if (r + 1 < N && step[r + 1][c] != -1) {
					if (A[r + 1][c] == 'U' || A[r + 1][c] == 'D' || A[r + 1][c] == 'L' || A[r + 1][c] == 'R') {
						if (step[r + 1][c] > step[r][c]) {
							step[r + 1][c] = step[r][c];
							rowQ.add(r + 1);
							colQ.add(c);
						}
					} else {
						if (step[r + 1][c] > step[r][c] + 1) {
							step[r + 1][c] = step[r][c] + 1;
							rowQ.add(r + 1);
							colQ.add(c);
						}
					}

				}
				if (c - 1 >= 0 && step[r][c - 1] != -1) {
					if (A[r][c - 1] == 'U' || A[r][c - 1] == 'D' || A[r][c - 1] == 'L' || A[r][c - 1] == 'R') {
						if (step[r][c - 1] > step[r][c]) {
							step[r][c - 1] = step[r][c];
							rowQ.add(r);
							colQ.add(c - 1);
						}
					} else {
						if (step[r][c - 1] > step[r][c] + 1) {
							step[r][c - 1] = step[r][c] + 1;
							rowQ.add(r);
							colQ.add(c - 1);
						}
					}
				}
				if (c + 1 < M && step[r][c + 1] != -1) {
					if (A[r][c + 1] == 'U' || A[r][c + 1] == 'D' || A[r][c + 1] == 'L' || A[r][c + 1] == 'R') {
						if (step[r][c + 1] > step[r][c]) {
							step[r][c + 1] = step[r][c];
							rowQ.add(r);
							colQ.add(c + 1);
						}
					} else {
						if (step[r][c + 1] > step[r][c] + 1) {
							step[r][c + 1] = step[r][c] + 1;
							rowQ.add(r);
							colQ.add(c + 1);
						}
					}
				}
			} else if (A[r][c] == 'U') {
				if (r - 1 >= 0 && step[r - 1][c] != -1) {
					if (A[r - 1][c] == 'U' || A[r - 1][c] == 'D' || A[r - 1][c] == 'L' || A[r - 1][c] == 'R') {
						if (step[r - 1][c] > step[r][c]) {
							step[r - 1][c] = step[r][c];
							rowQ.add(r - 1);
							colQ.add(c);
						}
					} else {
						if (step[r - 1][c] > step[r][c] + 1) {
							step[r - 1][c] = step[r][c] + 1;
							rowQ.add(r - 1);
							colQ.add(c);
						}
					}
				}
			} else if (A[r][c] == 'D') {
				if (r + 1 < N && step[r + 1][c] != -1) {
					if (A[r + 1][c] == 'U' || A[r + 1][c] == 'D' || A[r + 1][c] == 'L' || A[r + 1][c] == 'R') {
						if (step[r + 1][c] > step[r][c]) {
							step[r + 1][c] = step[r][c];
							rowQ.add(r + 1);
							colQ.add(c);
						}
					} else {
						if (step[r + 1][c] > step[r][c] + 1) {
							step[r + 1][c] = step[r][c] + 1;
							rowQ.add(r + 1);
							colQ.add(c);
						}
					}
				}
			} else if (A[r][c] == 'L') {
				if (c - 1 >= 0 && step[r][c - 1] != -1) {
					if (A[r][c - 1] == 'U' || A[r][c - 1] == 'D' || A[r][c - 1] == 'L' || A[r][c - 1] == 'R') {
						if (step[r][c - 1] > step[r][c]) {
							step[r][c - 1] = step[r][c];
							rowQ.add(r);
							colQ.add(c - 1);
						}
					} else {
						if (step[r][c - 1] > step[r][c] + 1) {
							step[r][c - 1] = step[r][c] + 1;
							rowQ.add(r);
							colQ.add(c - 1);
						}
					}
				}
			} else if (A[r][c] == 'R') {
				if (c + 1 < M && step[r][c + 1] != -1) {
					if (A[r][c + 1] == 'U' || A[r][c + 1] == 'D' || A[r][c + 1] == 'L' || A[r][c + 1] == 'R') {
						if (step[r][c + 1] > step[r][c]) {
							step[r][c + 1] = step[r][c];
							rowQ.add(r);
							colQ.add(c + 1);
						}
					} else {
						if (step[r][c + 1] > step[r][c] + 1) {
							step[r][c + 1] = step[r][c] + 1;
							rowQ.add(r);
							colQ.add(c + 1);
						}
					}
				}
			}
		}

		for (int i = 0; i < x.size(); i++) {
			int s = step[x.get(i)][y.get(i)];
			if (s == -1 || s == Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(s);
			}
		}
	}
}