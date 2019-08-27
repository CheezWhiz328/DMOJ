import java.util.*;
import java.io.*;

public class FrenchHomework {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		String b = sc.next();
		String c;
		if(b.charAt(b.length()-1)=='e') {
			c = "la";
		}else if(b.charAt(b.length()-1)=='s') {
			c = "les";
		}else {
			c = "le";
		}System.out.println(a+"-tu "+c+" "+b+" ?");
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
