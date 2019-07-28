import java.util.*;
import java.io.*;

public class RinsletLaurenfrost {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		int[] a1 = new int[26];
		for (int i = 0; i < a.length(); i++) {
			a1[a.charAt(i) - 'a']++;
		}

		String b = sc.next();
		int[] b1 = new int[26];
		for (int i = 0; i < b.length(); i++) {
			b1[b.charAt(i) - 'a']++;
		}
		
		int count = 0;
		for(int i=0; i<26; i++) {
			count += Math.abs(a1[i]-b1[i]);
		}
		
		System.out.println(count);
		
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
