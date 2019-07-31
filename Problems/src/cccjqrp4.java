import java.util.*;
import java.io.*;

public class cccjqrp4 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		// https://oeis.org/A000984, hardcode to 1 mil
		LinkedList<Integer> bico = new LinkedList<Integer>();
		bico.add(1);
		bico.add(2);
		bico.add(6);
		bico.add(20);
		bico.add(70);
		bico.add(252);
		bico.add(924);
		bico.add(3432);
		bico.add(12870);
		bico.add(48620);
		bico.add(184756);
		bico.add(705432);


		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean c = true;
			for (int j = 0; j < bico.size(); j++) {
				if (i == bico.get(j)) {
					c = false;
					break;
				}
			}
			System.out.println(c ? a + b : a - b);
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