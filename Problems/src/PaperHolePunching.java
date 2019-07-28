import java.util.*;
import java.io.*;

public class PaperHolePunching {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		String a = sc.next();
		boolean[] b = new boolean[6];
		for(int i=0; i<6; i++) {
			if(a.indexOf(i+'A')!=-1){
				b[i] = true;
			}
		}
		for(int i=0; i<6; i++) {
			System.out.println(b[i]);
		}
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			String d = sc.next();
			
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
