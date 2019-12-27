import java.util.*;
import java.io.*;

public class coci08c2p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean sieve[] = new boolean[n + 1];
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (!sieve[i]) {
				for (int j = i; j <= n; j += i) {
					if (!sieve[j]) {
						sieve[j] = true;
						count++;
						if (count == k) {
							System.out.println(j);
							System.exit(0);
						}
					}
				}
			}
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
