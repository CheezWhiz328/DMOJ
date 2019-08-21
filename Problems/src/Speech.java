import java.util.*;
import java.io.*;

public class Speech {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		String r[] = new String[a];
		String f[] = new String[a];
		for(int i=0; i<a; i++) {
			r[i] = sc.next();
			f[i] = sc.next();
		}String b[] = sc.nextLine().replace(".", "").split(" ");
		for(int i=0; i<a; i++) {
			for(int j=0; j<b.length; j++) {
				if(b[j].equals(f[i])) {
					b[j] = r[i];
				}
			}
		}for(int i=0; i<b.length - 1; i++) {
			System.out.print(b[i]+" ");
		}System.out.print(b[b.length-1]+".");
		
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
