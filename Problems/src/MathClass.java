import java.util.*;
import java.io.*;

public class MathClass {
	static int[] dp = new int[5005];

	static int get(LinkedList<Integer> num, int count, int N) {
		for(int i=0; i<num.size(); i++) {
			if(count+num.get(i)<=N) {
				
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		Arrays.fill(dp, (1 << 30));
		dp[0] = 0;
		
		LinkedList<Integer> num = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			int N = sc.nextInt();
			if (N == 1) {
				num.add(i);
			}
		}
		int N = sc.nextInt();

		
		int count = 0;
		while(dp[N]!=0) {
			for (int i = 0; i< num.size(); i++) {
//				if (j + num.get(i) <= N) {
//					dp[j + num.get(i)] = Math.min(dp[j + num.get(i)], dp[j] + 1);
//				}
//				if (j * num.get(i) <= N) {
//					dp[j * num.get(i)] = Math.min(dp[j * num.get(i)], dp[j] + 1);
//				}
//
//				if (j * 10 + num.get(i) <= N) {
//					dp[j * 10 + num.get(i)] = Math.min(dp[j * 10 + num.get(i)], dp[j] + 1);
//				}
			}System.out.println(dp[N]);
		}
		System.out.println(dp[N]);
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
