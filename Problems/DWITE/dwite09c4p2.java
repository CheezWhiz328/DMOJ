import java.util.*;
import java.io.*;

public class dwite09c4p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int t  = 5;
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[101];
			for (int i = 0; i < n; i++) {
				arr[sc.nextInt()]++;
			}
			Arrays.sort(arr);
			if(arr[100]>n/2 && arr[100]!=arr[99]) {
				System.out.println("verified");
			}else if(arr[100]<=n/2 && arr[100]!=arr[99]) {
				System.out.println("unverified");
			}else {
				System.out.println("unknown");
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
