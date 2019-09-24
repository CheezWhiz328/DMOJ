import java.util.*;
import java.io.*;

public class ecoo16r1p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for (int t = 0; t < 10; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int count = 0;
			int T = sc.nextInt();
			for(int i=0; i<T; i++) {
				int a1= sc.nextInt();
				int b1 = sc.nextInt();
				int c1 = sc.nextInt();
				int d1 = sc.nextInt();
				int ans = a*a1+b*b1+c*c1+d*d1;
				if(ans>=5000) {
					count++;
				}
				
			}System.out.println(count);
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
