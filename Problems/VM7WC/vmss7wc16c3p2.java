import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class vmss7wc16c3p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt();
		int E = sc.nextInt();
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;

		boolean[][] map = new boolean[V][V];
		for (int i = 0; i < E; i++) {
			int bv = sc.nextInt() - 1;
			int ev = sc.nextInt() - 1;
			map[bv][ev] = true;
			map[ev][bv] = true;
		}

		int[] step = new int[V];
		Arrays.fill(step, 1 << 30);

		LinkedList<Integer> queue = new LinkedList<Integer>();

		step[a] = 0;
		queue.add(a);

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			for (int c = 0; c < V; c++) {
				if (map[cur][c] == true && step[c] > step[cur] + 1) {
					step[c] = step[cur] + 1;
					queue.add(c);
				}
			}
		}

		System.out.println(step[b] != 1 << 30 ? "GO SHAHIR!" : "NO SHAHIR!");

	}
}