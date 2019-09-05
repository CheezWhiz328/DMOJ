import java.util.*;
import java.io.*;

public class ASDFGHJKL {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		String s = sc.next();
		int L = sc.nextInt();
		
		int K = sc.nextInt();
		int[] alp = new int[26];
		for(int i=0; i<s.length(); i++) {
			alp[s.charAt(i)-'a']++;
		}
		
		for(int i=0; i<K; i++) {
			Arrays.parallelSort(alp);
			alp[25]--;
		}
		long count = 0;
		for(int i=0; i<26; i++) {
			count += alp[i] * alp[i];
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
