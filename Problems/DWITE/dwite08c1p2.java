import java.util.*;
import java.io.*;

public class dwite08c1p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int t = 5;
		while(t-->0) {
			String a = sc.next();
			char b = (char) (sc.next().charAt(0) - 'A' + '0' + 1);
			
			while(a.length()>1) {
				int count = 0;
				for(int i=0; i<a.length(); i++) {
					count+=a.charAt(i)-'0';
				}
				
				a = Integer.toString(count);
			}

			System.out.println(a.charAt(0)==b ? "match" : "error");
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
