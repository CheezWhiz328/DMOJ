import java.util.*;
import java.io.*;

public class dmopc19c1p2 {

	static String f(int n) {

		if (n == 0) {
			return "Good writing is good writing is good writing.";
		}

		return "Good writing is good " + f(n - 1) + " writing is good " + f(n - 1) + " is good writing.";

	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

//		System.out.println("Good writing is good writing is good writing.".length());
//		for (int i = 0; i < 31; i++) {
//			System.out.println(f(i).length() + " " + (long) ((Math.pow(2, i) - 1) * 100 + 45) + " " + i);
//		}

		int q = sc.nextInt();
		while (q-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt() - 1;
			String s = "";
			
			if (n < 25) {
				s = f(n);
			}
			if (k < s.length()) {
				System.out.println(s.charAt(k));
			} else {
				System.out.println(".");
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
