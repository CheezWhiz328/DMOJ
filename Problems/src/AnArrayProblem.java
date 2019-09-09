import java.util.*;
import java.io.*;

public class AnArrayProblem {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		if(a==1) {
			System.out.println(0);
			System.exit(0);
		}
		int []arr = new int[a];
		int count = 0;
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
			count+=arr[i];
		}
		
		Arrays.sort(arr);
		int max = arr[a-1];
		System.out.println(Math.min(count - max, count/2));
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
