import java.util.*;
import java.io.*;

public class IOI101 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		String a = sc.next();
		a = a.replace("0", "O");
		a = a.replace("1", "l");
		a = a.replace("3", "E");
		a = a.replace("4", "A");
		a = a.replace("5", "S");
		a = a.replace("6", "G");
		a = a.replace("8", "B");
		a = a.replace("9", "g");
		System.out.println(a);
		
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
