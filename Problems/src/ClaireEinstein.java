import java.util.*;
import java.io.*;

public class ClaireEinstein{

    static int n, m, path_sum[] = new int[100005], path_count[] = new int[100005];
    static int MAXN = 1000000007;
    static ArrayList<Integer> adj[] = new ArrayList[100005];

    static void dfs(int N){
        if (adj[N].size() == 0){
            path_sum[N] = 0;
            path_count[N] = 1;
            return;
        }
        if (path_count[N] > 0){
            return;
        }
        for (int i:adj[N]){
            dfs(i);
            path_count[N] = (path_count[N] + path_count[i]) % MAXN;
            path_sum[N] = (path_sum[N] + path_count[i]) % MAXN;
            path_sum[N] = (path_sum[N] + path_sum[i]) % MAXN;
        }
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        n = sc.nextInt(); m = sc.nextInt();
        int[] indegree = new int[100005];
        for (int l = 0; l <= n; ++l){
            adj[l] = new ArrayList<Integer>();
        }
        for (int l = 0; l < m; ++l){
            int a = sc.nextInt(), b = sc.nextInt();
            adj[a].add(b);
            indegree[b] ++;
        }
        long ans = 0;
        for (int l = 1; l <= n; ++l){
            if (indegree[l] == 0){
                dfs(l);
                ans = (ans + path_sum[l]) % MAXN;
            }
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