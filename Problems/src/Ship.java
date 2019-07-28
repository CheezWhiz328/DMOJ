import java.util.*;
import java.io.*;

public class Ship {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		boolean a = false;
		if(!s.contains("B")) {
			System.out.println("B");
			a = true;
		}if(!s.contains("F")) {
			System.out.println("F");
			a = true;
		}if(!s.contains("T")) {
			System.out.println("T");
			a = true;
		}if(!s.contains("L")) {
			System.out.println("L");
			a = true;
		}if(!s.contains("C")) {
			System.out.println("C");
			a = true;
		}
		if(!a)
			System.out.println("NO MISSING PARTS");
		
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
