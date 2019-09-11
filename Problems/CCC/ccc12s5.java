import java.util.Arrays;
import java.util.Scanner;

public class ccc12s5 {

	static int[][] dp;// store previously calculated answer

	static boolean[][] hasCat;

	static int ways(int r, int c) {
		if (r < 0 || c < 0) {// out of bounds: cannot go
			return 0;
		}
		if (r == 0 && c == 0) {// starting position
			return 1;
		}
		if (hasCat[r][c]) {// has cat, cannot go
			return 0;
		}

		if (dp[r][c] == -1) {// if answer is not calculated yet
			dp[r][c] = ways(r - 1, c) + ways(r, c - 1);// calculate it
		}

		return dp[r][c];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		hasCat = new boolean[r][c];
		dp = new int[r][c];
		for (int i = 0; i < r; i++) {
			Arrays.fill(dp[i], -1);
		}

		int k = sc.nextInt();// number of cats
		for (int i = 0; i < k; i++) {
			int catR = sc.nextInt() - 1;
			int catC = sc.nextInt() - 1;
			hasCat[catR][catC] = true;
		}

		System.out.println(ways(r - 1, c - 1));
	}

}
