import java.util.*;
import java.io.*;

public class ccc10j3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = 0;
		int b = 0;

		while (true) {
			int t = sc.nextInt();

			if (t == 7) {
				System.exit(0);
			}

			if (t == 1) {
				String s = sc.next();
				int n = sc.nextInt();
				if (s.charAt(0) == 'A') {
					a = n;
				} else {
					b = n;
				}
			}

			if (t == 2) {
				String s = sc.next();

				if (s.charAt(0) == 'A') {
					System.out.println(a);
				} else {
					System.out.println(b);
				}
			}

			if (t == 3) {
				String s = sc.next();

				if (s.charAt(0) == 'A') {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						a += a;
					} else {
						a += b;
					}
				} else {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						b += a;
					} else {
						b += b;
					}
				}

			}
			
			if (t == 4) {
				String s = sc.next();

				if (s.charAt(0) == 'A') {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						a *= a;
					} else {
						a *= b;
					}
				} else {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						b *= a;
					} else {
						b *= b;
					}
				}

			}
			
			if (t == 5) {
				String s = sc.next();

				if (s.charAt(0) == 'A') {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						a -= a;
					} else {
						a -= b;
					}
				} else {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						b -= a;
					} else {
						b -= b;
					}
				}

			}
			
			if (t == 6) {
				String s = sc.next();

				if (s.charAt(0) == 'A') {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						a /= a;
					} else {
						a /= b;
					}
				} else {
					String s1 = sc.next();
					if (s1.charAt(0) == 'A') {
						b /= a;
					} else {
						b /= b;
					}
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
