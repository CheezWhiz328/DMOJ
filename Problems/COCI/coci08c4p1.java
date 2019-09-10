import java.util.*;
import java.io.*;

public class coci08c4p1 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = 5;
		int b[] = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		
// 		for(int i=0; i<a; i++) {
// 			System.out.print(b[i]+" ");
// 		}
// 		System.out.println();

		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for(int i = 1; i<a; i++) {
				if(b[i] < b[i-1]) {
					sorted = false;
					int c = b[i];
					b[i] = b[i-1];
					b[i-1] = c;
					for(int print = 0; print <a; print++) {
						System.out.print(b[print]+" ");
					}
					System.out.println();
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