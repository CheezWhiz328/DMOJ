import java.util.*;
import java.io.*;

public class naq15f {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			boolean arr[] = new boolean[26];
			String b = sc.nextLine();
			b = b.toLowerCase();
			for(int j=0; j<b.length(); j++) {
				if(b.charAt(j) - 97 >= 0 && b.charAt(j) - 97 <= 25) {
				arr[b.charAt(j) - 97] = true;
				}
			}
			String c = "";
			for(int j=0; j<26; j++) {
				if(!arr[j]) {
					c+=(char)(j+97);
				}
			}System.out.println(c.equals("") ? "pangram" : "missing " + c);
			
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