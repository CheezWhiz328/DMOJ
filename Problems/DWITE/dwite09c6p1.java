import java.util.*;
import java.io.*;

public class dwite09c6p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		for (int t = 0; t < 5; t++) {
			char a[] = sc.nextLine().toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= 65 && a[i] <= 90) {
					a[i]+=13;
					if(a[i]>90) {
						a[i]-=26;
					}
				}System.out.print(a[i]);
			}System.out.println();
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