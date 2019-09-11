import java.util.*;
import java.io.*;

public class ccc16s1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		String b = sc.next();

		int c[] = new int[26];

		for (int i = 0; i < a.length(); i++) {
			c[a.charAt(i) - 'a']++;
			if (b.charAt(i) != '*') {
				c[b.charAt(i) - 'a']--;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (c[i] < 0) {
				System.out.println("N");
				System.exit(0);
			}
		}
		
		System.out.println("A");
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
