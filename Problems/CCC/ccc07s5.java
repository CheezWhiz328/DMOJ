import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ccc07s5 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int pin = sc.nextInt();
			int ball = sc.nextInt();
			int width = sc.nextInt();
			int[] pins = new int[pin];
			int[][] dp = new int[ball + 1][pin];
			for (int j = 0; j < pin; j++) {
				pins[j] = sc.nextInt();
			}
			for (int j = 1; j <= ball; j++) {
				for (int k = 0; k < pin; k++) {
					int score = 0;
					for (int l = k; l > k - width; l--) {
						if(l<0) {
							break;
						}
						score += pins[l];
					}
					if(k>0 && width<=k) {
						dp[j][k] = Math.max(dp[j][k - 1], dp[j - 1][k - width] + score);
					}
					else {
						dp[j][k] = score;
					}
				}
			}
			System.out.println(dp[ball][pin - 1]);
		}
	}
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
