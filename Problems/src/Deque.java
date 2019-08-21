import java.util.*;
import java.io.*;

public class Deque {
	static long[][] dp = new long[105][105];
	static boolean[][] check = new boolean[105][105];
	static long[] board = new long[105];

	static long score(int x, int y) {
		if (x > y) {
			return 0;
		}
		if (!check[x][y]) {
			check[x][y] = !check[x][y];
			dp[x][y] = Math.max(Math.min(score(x + 1, y - 1), score(x + 2, y)) + board[x],
					Math.min(score(x + 1, y - 1), score(x, y - 2)) + board[y]);
		}
		return dp[x][y];
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		long count = 0;
		for (int i = 0; i < N; i++) {
			board[i] = sc.nextInt();
			count += board[i];
		}

		long scroe = score(0, N - 1);
		System.out.println(scroe - (count - scroe));

	}
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}