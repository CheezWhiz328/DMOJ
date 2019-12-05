import java.util.*;
import java.io.*;

public class coci06p3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int h = sc.nextInt();

		int grid[] = new int[500001];

		for (int i = 0; i < n; i += 2) {
			grid[h - sc.nextInt()]++;
			grid[sc.nextInt()]--;
		}

		int distinct = 0;
		int count = n / 2;
		int min = 1<<30;
		for (int i = 1; i <= h; i++) {
			count += grid[i];
			if (count < min) {
				min = count;
				distinct = 0;
			}
			if (min == count) {
				distinct++;
			}
			
//			System.out.println(min+" "+count+" "+distinct);

		}

		System.out.println(min + " " + distinct);

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
