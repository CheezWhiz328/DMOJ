import java.util.Arrays;
import java.util.Scanner;

public class ccc00s4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dis = sc.nextInt();
		int clubs = sc.nextInt();
		int[] arr = new int[40];
		for (int i = 0; i < clubs; i++) {
			arr[i] = sc.nextInt();
		}

		int[] dp = new int[5555];
		Arrays.fill(dp, (1 << 30));
		dp[0] = 0;
		for (int i = 0; i < dis; i++) {
			for (int j = 0; j < clubs; j++) {
				dp[i + arr[j]] = Math.min(dp[i + arr[j]], dp[i] + 1);
			}
		}
		
//		for(int i=0; i<dis; i++) {
//			System.out.println(dp[i]);
//		}

		if (dp[dis] == (1 << 30)) {
			System.out.println("Roberta acknowledges defeat.");
			System.exit(0);
		}
		System.out.println("Roberta wins in " + dp[dis] + " strokes.");
	}
}