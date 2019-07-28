import java.util.*;
import java.io.*;

public class GoatFence {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		System.out.println(2*a+2);
//		double b = Math.sqrt(a);
//		if(b==(int)(b)) {
//			System.out.println(4*a);
//			System.exit(0);
//		}
//		while(true) {
//			for(int i=(int) b; i>=1; i--) {
//				for(int j=(int) (b+1); j<=a; j++) {
//					if(i*j==a) {
//						System.out.println(2 * i + 2 * j);
//						System.exit(0);
//					}
//				}
//			}
//
//		}
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
