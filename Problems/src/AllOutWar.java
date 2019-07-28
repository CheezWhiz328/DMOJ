import java.util.*;
import java.io.*;

public class AllOutWar {
	static int[] arr = new int[120005];
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int min = 1999999999;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		
		for(int i=0; i<Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int decimate = sc.nextInt();
			int min1 = arr[l];
			for(int j=l-1; j<=r-1; j++) {
				arr[j] -= decimate;
				if(arr[j]<0) {
					arr[j] = 0;
				}
				
				if(min1>arr[j]) {
					min1 = arr[j];
				}
				
			}
			if(min == 54569) {
				continue;
			}else if(min>min1) {
				min = min1;
			}

			System.out.println(min1+" "+min);
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
