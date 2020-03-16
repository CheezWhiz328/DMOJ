import java.util.*;
import java.io.*;

public class dwite09c3p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		String arr[] = new String[5];
		
		for(int i=0; i<5; i++) {
			String s = sc.nextLine();
			arr[sc.nextInt()-1] = s;
		}
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
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
