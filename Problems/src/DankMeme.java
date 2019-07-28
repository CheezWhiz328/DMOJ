import java.util.*;
import java.io.*;

public class DankMeme {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {

			a = sc.nextInt();
			String s = Integer.toBinaryString(a);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1') {
					System.out.print("dank ");
				} else {
					System.out.print("meme ");
				}
			}System.out.println();
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
