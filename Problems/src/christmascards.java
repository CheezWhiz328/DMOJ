import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class christmascards{

    public static void main(String[] args) {
    	FastReader in = new FastReader();
        int n = in.nextInt();
        int[] c = new int[5001], d = new int[5001];
        long[][] dp = new long[5001][5001];
        for (int i = 0; i <= n; i++){
        	for(int j=0; j<=n; j++) {
        		dp[j][i] = Long.MAX_VALUE / 2;
        	}
        }
        
        dp[1][0] = 0;
        for (int i = 0; i < n; ++i){
        	
            c[i] = in.nextInt();
            d[i] = in.nextInt();
        }
        
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= n; j++){
                if (j >= i) 
                	break;

                dp[Math.min(i + d[j], n)][j+1] = Math.min(dp[Math.min(i + d[j], n)][j+1], dp[i][j] + c[j]);
                dp[i][j+1] = Math.min(dp[i][j+1], dp[i][j]);
            }
        }
        System.out.println(dp[n][n]);
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