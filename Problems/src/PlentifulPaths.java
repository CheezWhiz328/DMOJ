import java.util.*;

public class PlentifulPaths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[][] table = new boolean[m + 1][n + 1];
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && x == y) {
				break;
			}
			table[x][y] = true;
		}
		int solution[][] = new int[m+1][n+1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				if (table[i][j]) {
					solution[i][j]++;
				}
				solution[i][j] += Math.max(solution[i - 1][j], solution[i][j - 1]);
			}
		}
		System.out.println(solution[m][n]);
	}
}