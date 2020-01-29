import java.util.*;
import java.io.*;

public class dwite07c2p4 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		for (int i = 0; i < 5; i++) {
			String s = sc.next();
			s = s.replaceAll("[a-z0-9]", "");
			
			for(int j=0; j<100; j++) {
				s = s.replaceAll("\\(\\)", "");
				s = s.replaceAll("\\[\\]", "");
				s = s.replaceAll("\\{\\}", "");
			}
			
//			System.out.println(s);

			System.out.println(s.isEmpty() ? "balanced" : "not balanced");
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
