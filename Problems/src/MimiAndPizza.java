import java.util.*;
import java.io.*;

public class MimiAndPizza {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int b = sc.nextInt(), p = sc.nextInt();
		String y1 = sc.next();
		boolean Y = y1.equals("Y") ? true : false;
		if (p * 5 <= b) {
			System.out.println(Y ? "B" : "A");
		} else if (p * 2 <= b) {
			System.out.println(Y ? "D" : "C");
		} else {
			System.out.println("NO PIZZA");
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
