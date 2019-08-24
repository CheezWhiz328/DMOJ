// convert to c++
import java.util.*;
import java.io.*;
public class UnexpectedFactorial {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.nextLine();
		for(int i=2; i<a.length(); i++) {
			if(a.charAt(i)=='!'&& a.charAt(i-1)>=48 && a.charAt(i-1)<=57 && a.charAt(i-2)>=48 && a.charAt(i-2)<=57) {
				int b = (a.charAt(i-2) - 48) * 10 + a.charAt(i-1) - 48;
				long fac = 1;
				for(int j=1; j<=b; j++) {
					fac *= j;
				}System.out.println(fac);
				System.exit(0);
			}
		}
		
		for(int i=1; i<a.length(); i++) {
			if(a.charAt(i)=='!'&& a.charAt(i-1)>=48 && a.charAt(i-1)<=57) {
				int b = a.charAt(i-1) - 48;
				long fac = 1;
				for(int j=1; j<=b; j++) {
					fac *= j;
				}System.out.println(fac);
				System.exit(0);
			}
		}System.out.println(-1);
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
