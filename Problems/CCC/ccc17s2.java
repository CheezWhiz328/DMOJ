import java.util.*;
import java.io.*;

public class ccc17s2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}Arrays.sort(a);
		int min = N/2-1;
		int max = N/2;
		if(N%2==1) {
			min++;
			max++;
			for(int i=0; i<N/2; i++) {
				System.out.print(a[min]+" "+a[max]+" ");
				min--;
				max++;
				
			}
			System.out.print(a[0]);
			System.exit(0);
		}
		for(int i=0; i<N/2; i++) {
			System.out.print(a[min]+" "+a[max]+" ");
			min--;
			max++;
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
