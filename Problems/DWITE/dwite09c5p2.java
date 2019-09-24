import java.util.*;
import java.io.*;

public class dwite09c5p2 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int num = 20;
		boolean[] notprime = new boolean[num + 1];
		notprime[1] = true;
		for(int i=2; i<=num; i++) {
			if(!notprime[i]) {
				for(int j = 2 * i; j<=num; j+=i) {
					notprime[j] = true;
				}
			}
		}
//		for(int i=1; i<=110; i++) {
//			if(!notprime[i]) {
//				System.out.println(i);
//			}
//		}
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			boolean a = false, b = false;
			int a1 = n, b1 = n;
			while(true) {
				
				a1++;
				if(!notprime[a1] && a) {
					System.out.println(a1);
					break;
				}
				
				if(!notprime[a1]) {
					a = true;
				}
				
				b1--;
				if(!notprime[b1] && b) {
					System.out.println(b1);
					break;
				}
				
				if(!notprime[b1]) {
					b = true;
				}
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
