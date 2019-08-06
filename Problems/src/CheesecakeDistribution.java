import java.util.*;
import java.io.*;

public class CheesecakeDistribution {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		long count = 0;
		int []arr = new int[a];
		for (int i = 0; i < a; i++) {
			int N =  sc.nextInt();
			count += N;
			arr[i] = N;
		}
		if (count % a != 0) {
			System.out.println("Impossible");
			System.exit(0);
		}
		
		int an = 0;
		for(int i=0; i<a; i++) {
			an += Math.abs(arr[i] -= count/a);
		}
		
		System.out.println(an/2);
		
		

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
