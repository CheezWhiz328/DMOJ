import java.io.*;
import java.util.*;

public class ccc20j4 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String t = sc.next();
		String s = sc.next();
		String a = s;
		boolean good = false;
		for (int i = 0; i < a.length(); i++) {
			if (t.contains(a)) {
				good = true;
				break;
			}
			a = a.substring(1) + a.charAt(0);
//			System.out.println(a);
		}

		System.out.println(good ? "yes" : "no");

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
