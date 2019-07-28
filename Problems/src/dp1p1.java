import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp1p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		long[] max = new long[N];
		max[0] = Math.max(0, sc.nextInt());
		max[1] = Math.max(0, Math.max(max[0], sc.nextInt()));
		for (int i = 2; i < N; i++) {
			max[i] = Math.max(0,Math.max(sc.nextInt() + max[i - 2], max[i - 1]));
			
		}
		System.out.println(max[N - 1]);
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