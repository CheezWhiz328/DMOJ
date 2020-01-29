import java.util.*;
import java.io.*;

public class dwite09c3p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int fib[] = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
				17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887,
				9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733,
				1134903170 };
		int t = 5;
		while (t-- > 0) {
			int n = sc.nextInt();
			int min = 1<<30;
			int ind = 0;
			for(int i=0; i<fib.length; i++) {
				if(Math.abs(n-fib[i])<min) {
					min = Math.abs(n - fib[i]);
					ind = i;
				}
			}
			System.out.println(fib[ind]);
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
