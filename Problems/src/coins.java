import java.util.Scanner;

public class coins {

	static int minCoins(int dp[], int cash) {
		if (cash == 0) {
			return 0;
		}
		int res = (1 << 30);
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] < cash + 1) {
				if (minCoins(dp, cash - dp[i]) < (1 << 30) && minCoins(dp, cash - dp[i]) < res) {
					res = minCoins(dp, cash - dp[i]) + 1;
				}
			}
		}
		return res;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int dollars = sc.nextInt();
		int coins = sc.nextInt();
		int[] coin = new int[coins];
		for (int i = 0; i < coins; i++) {
			coin[i] = sc.nextInt();
		}

		System.out.println(minCoins(coin, dollars));
	}

}
