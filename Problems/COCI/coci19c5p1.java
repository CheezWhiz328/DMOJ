import java.util.LinkedList;
import java.util.Scanner;

public class coci19c5p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		int a = sc.nextInt();
		boolean grid[][] = new boolean[b][a];
		for (int i = 0; i < b; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '*') {
					grid[i][j] = true;
				}
			}
		}

		int count = 0;
		boolean vis[][] = new boolean[b][a];
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				if (grid[i][j] && !vis[i][j]) {
					count++;
					LinkedList<Integer> rowQ = new LinkedList<Integer>();
					LinkedList<Integer> colQ = new LinkedList<Integer>();

					rowQ.add(i);
					colQ.add(j);
					vis[i][j] = true;

					while (!rowQ.isEmpty()) {
						int R = rowQ.poll();
						int C = colQ.poll();

						if (R + 1 < b && !vis[R + 1][C] && grid[R + 1][C]) {
							vis[R + 1][C] = true;
							rowQ.add(R + 1);
							colQ.add(C);
						}

						if (R - 1 >= 0 && !vis[R - 1][C] && grid[R - 1][C]) {
							vis[R - 1][C] = true;
							rowQ.add(R - 1);
							colQ.add(C);
						}

						if (C + 1 < a && !vis[R][C + 1] && grid[R][C + 1]) {
							vis[R][C + 1] = true;
							rowQ.add(R);
							colQ.add(C + 1);
						}

						if (C - 1 >= 0 && !vis[R][C - 1] && grid[R][C - 1]) {
							vis[R][C - 1] = true;
							rowQ.add(R);
							colQ.add(C - 1);
						}

					}

				}
			}

		}
		System.out.println(count);

	}
}
