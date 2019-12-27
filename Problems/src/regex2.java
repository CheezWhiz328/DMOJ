import java.util.*;
import java.io.*;

public class regex2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		String regex = "\\b\\w{4}\\b";
		while(n-->0) {
			String s = sc.nextLine();
			s = s.replaceAll(regex, "****");
			System.out.println(s);
			
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
