import java.util.*;
import java.io.*;

public class ccc08s5{

    static boolean[][][][] dp = new boolean[31][31][31][31], visit = new boolean[31][31][31][31];
    static boolean solve(int A, int B, int C, int D){
        //if the last move is illegal, you win
        if (A < 0 || B < 0 || C < 0 || D < 0) return true;
        //if your state is visited, return your previous value
        if (visit[A][B][C][D]) return dp[A][B][C][D];
        visit[A][B][C][D] = true;
        
        //set dp to true if any of the possible next values is false
        dp[A][B][C][D] = (!solve(A-2, B-1, C, D-2) || !solve(A-1, B-1, C-1, D-1) ||
                          !solve(A, B, C-2, D-1) || !solve(A, B-3, C, D) || !solve(A-1, B, C, D-1));
        return dp[A][B][C][D];
    }
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        while(n-- > 0){
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
            System.out.println(solve(a, b, c, d)?"Patrick":"Roland");
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
