import java.util.*;
import java.io.*;

public class chocolatemilk{

    static int n, k, dp[][] = new int[405][405];
    static int[] c = new int[405], f = new int[405], p = new int[405];
    static ArrayList<Integer> adj[] = new ArrayList[405];

    static void dfs(int N){
        dp[N][0] = p[N];

        for (int C:adj[N]){
            dfs(C);
            int copy[] = new int[405]; //store all future answers
            for (int i = 0; i <= k; ++i){
                for (int j = 0; j <= k; ++j){
                    //no new upgrade
                    copy[i + j] = Math.max(copy[i + j], dp[N][i] + Math.min(dp[C][j], f[C]));
                    //new upgrade
                    copy[i + j + 1] = Math.max(copy[i + j + 1], dp[N][i] + dp[C][j]);
                }
            }
            dp[N] = copy;
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        n = in.nextInt(); k = in.nextInt();
        for (int l = 1; l <= n; ++l) adj[l] =new ArrayList<Integer>();
        for (int l = 2; l <= n; ++l){
            p[l] = in.nextInt();
            c[l] = in.nextInt();
            f[l] = in.nextInt();
            adj[c[l]].add(l);
        }
        dfs(1);
        int ans = 0;
        for (int l = 0; l <= k; ++l){
            ans = Math.max(ans, dp[1][l]);
        }
        System.out.println(ans);
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