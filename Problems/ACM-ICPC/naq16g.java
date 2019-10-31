import java.util.*;
import java.io.*;

public class naq16g {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		String s = sc.next();
		
//		jank
		if(s.equals("1")) {
			System.out.println(1);
			System.exit(0);
		}
		
		if(s.equals("2")) {
			System.out.println(2);
			System.exit(0);
		}
		
		if(s.equals("6")) {
			System.out.println(3);
			System.exit(0);
		}
		
		if(s.equals("24")) {
			System.out.println(4);
			System.exit(0);
		}
		
		if(s.equals("120")) {
			System.out.println(5);
			System.exit(0);
		}
		

		int i1 = 0;
		for(double i=0; i<s.length(); i+=Math.log10(++i1)){
		}
		System.out.println(i1 - 1);
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
