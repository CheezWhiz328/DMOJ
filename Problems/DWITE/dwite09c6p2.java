import java.util.*;
import java.io.*;

public class dwite09c6p2 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int num = 65536;
		boolean[] power = new boolean[num + 1];

		int two = 1;
		while (two <= 65536) {
			power[two] = true;
			two *= 2;
		}
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			boolean a = false, b = false;
			int a1 = n, b1 = n;
			while (true) {

				if (power[a1]) {
					System.out.println(a1);
					break;
				}
				a1++;

				if (power[b1]) {
					System.out.println(b1);
					break;
				}
				b1--;
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
