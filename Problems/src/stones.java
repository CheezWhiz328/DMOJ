import java.util.*;

public class stones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n + 1];
		boolean[] dp = new boolean[k + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i <= k; i++) {
			for (int j = 0; j < n; j++) {
				if (i - a[j] >= 0) {
					if (dp[i] == true || dp[i - a[j]] == false) {
						dp[i] = true;
					} else {
						dp[i] = false;
					}
				}
			}
		}
		System.out.println(dp[k] ? "First" : "Second");
	}
}