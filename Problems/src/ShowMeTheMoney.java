import java.util.*;
import java.io.*;

public class ShowMeTheMoney {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int count = 0;
		for(int i=0; i<5; i++) {
			String a = sc.next();
			boolean b = false;
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j)=='+') {
					count++;
				}else {
					count--;
				}
				if(count<0) {
					count = 0;
					b = true;
					break;
				}
			}System.out.println(b ? "OH NOES!" : count);
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
