import java.util.*;
import java.io.*;

public class HapaxLegomenon {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		String[] b = new String[a];
		for(int i=0; i<a; i++) {
			b[i] = sc.next();
		}
		
		int count = 0;
		for(int i=0; i<a; i++) {
			String c = b[i];
			int count1 = 0;
			for(String word : b){
			    if(word.equals(c)) 
			        count1++;
			}
			if(count1==1) {
				count++;
			}
		}System.out.println(count);
		
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