import java.util.*;
import java.io.*;

public class GreatGraffiti {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		int count = 4;
		if(a.contains("D")) {
			count--;
		}
		if(a.contains("M")) {
			count--;
		}
		if(a.contains("O")) {
			count--;
		}
		if(a.contains("J")) {
			count--;
		}
		System.out.println(count);
//		if(a.contains("DMOJ")) {
//			System.out.print("0");
//		}
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