import java.util.*;
import java.io.*;

public class SC2Multitasking {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		String s1 = "qwertyuiop";
		String s2 = "asdfghjkl";
		String s3 = "zxcvbnm";
		int count = 0;
		for(int i=0; i<n; i++) {
			String a = sc.next();
			String a1 = a;
			for(int j=0; j<s1.length(); j++) {
				a1 = a1.replaceAll(Character.toString(s1.charAt(j)), "");
			}
			if(a1.length()==0) {
				count++;
			}
			
			a1 = a;
			for(int j=0; j<s2.length(); j++) {
				a1 = a1.replaceAll(Character.toString(s2.charAt(j)), "");
			}
			if(a1.length()==0) {
				count++;
			}
			
			a1 = a;
			for(int j=0; j<s3.length(); j++) {
				a1 = a1.replaceAll(Character.toString(s3.charAt(j)), "");
			}
			if(a1.length()==0) {
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
