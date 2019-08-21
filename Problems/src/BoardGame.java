import java.util.*;
import java.io.*;

public class BoardGame {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.nextLine();
		a = a.replace(" ", "");
		int count = 0;
		int max = 0;
		int maxcount = 0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='L') {
				count++;
				maxcount++;
				max = Math.max(max, maxcount);
			}else {
				max = Math.max(max, maxcount);
				maxcount = 0;
			}
		}System.out.println(count+" "+max);
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
