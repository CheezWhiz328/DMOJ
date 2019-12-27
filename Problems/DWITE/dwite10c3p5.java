import java.util.*;
import java.io.*;

public class dwite10c3p5 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = 5;
		while (t-- > 0) {
			int n = sc.nextInt();
			String arr[] = new String[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.next();
			}
			for (int q = 0; q < 5; q++) {
				String s = sc.next();
				s = s.replace("?", ".");
				s = s.replace("*", ".*");

				String a = "";
				for (int i = 0; i < n; i++) {
					if (arr[i].matches(s)) {
						a += arr[i] + ", ";
//						System.out.println(a);
					}
				}
				if (a.equals("")) {
					System.out.println("NO MATCH");
				} else {
					System.out.println(a.substring(0, a.length()-2));
				}
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
