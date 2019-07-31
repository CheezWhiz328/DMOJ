import java.util.*;
import java.io.*;

public class CharacterAnalysis {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		String b = sc.next();
		
		int c[] = new int[128];
		for(int i=0; i<a.length()-1; i++) {
			c[a.charAt(i)]++;
			c[b.charAt(i)]--;
		}
		c[a.charAt(a.length()-1)]++;
		for(int i=0; i<128; i++) {
			if(c[i]!=0) {
				System.out.println((char)i);
				break;
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
