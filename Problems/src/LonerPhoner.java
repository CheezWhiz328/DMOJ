import java.util.*;
import java.io.*;

public class LonerPhoner {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			if (b.length() == 10 && (b.startsWith("647") || b.startsWith("416"))) {
				System.out.println("("+b.substring(0, 3)+")-"+b.substring(3,6)+"-"+b.substring(6,10));
			}else {
				System.out.println("not a phone number");
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
