import java.util.*;
import java.io.*;

public class Harambe1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		String arr[] = new String[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.next();
		}
		String ans = sc.next();
		int an = 0;
		int len = ans.length();
		int max = 1 << 30;
		for(int i=0; i<a; i++) {
			if(arr[i].length()<=len && ans.length()-arr[i].length()<max) {
				max = ans.length()-arr[i].length();
				an = i;
			}
		}System.out.println(arr[an]);
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
