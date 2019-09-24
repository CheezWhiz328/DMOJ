import java.util.*;
import java.io.*;

public class dwite11c5p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for(int t=0; t<5; t++) {
			int a = sc.nextInt();
			int count = 0;
			for(int i=1; i*i<=a; i++) {
				for(int j=i; i*j<=a; j++) {
//					System.out.println(i+" "+j);
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