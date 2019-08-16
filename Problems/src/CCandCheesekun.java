import java.util.*;
import java.io.*;

public class CCandCheesekun {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = "";
		if (a == 3 && b >= 95) {
			c = "absolutely";
		} else if (a == 1 && b <= 50) {
			c = "fairly";
		} else {
			c = "very";
		}
		System.out.println("C.C. is " + c + " satisfied with her pizza.");
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
