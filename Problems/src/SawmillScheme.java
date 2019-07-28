import java.util.*;
import java.io.*;

public class SawmillScheme{

    static int n, m;
    static ArrayList<Integer> adj[] = new ArrayList[1000005];
    static double p[] = new double[1000005];
    static void dfs(int N){
        for (int i:adj[N]){
            p[i] += p[N]/adj[N].size();
            dfs(i);
        }
    }
    public static void main(String[] args) {
        FastReader in = new FastReader();
        n = in.nextInt(); m = in.nextInt();
        for (int l = 1; l <= n; ++l){
            adj[l] = new ArrayList<Integer>();
        }
        for (int l = 0; l < m; ++l){
            int x = in.nextInt(), y = in.nextInt();
            adj[x].add(y);
        }
        p[1] = 1;
        dfs(1);
        String out = "";
        for (int l = 1; l <= n; ++l){
            if (adj[l].size() == 0){
                out += p[l] + "\n";
            }
        }
        System.out.print(out);
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