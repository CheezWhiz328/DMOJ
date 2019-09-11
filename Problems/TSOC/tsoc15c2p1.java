import java.util.*;
import java.io.*;

public class tsoc15c2p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		while(arr[i]!=0) {
		    if(arr[i]==0){
		        System.exit(0);
		    }
			i+=arr[i];
			if(arr[i]==0){
		        System.exit(0);
		    }
			System.out.print((char)(arr[i]+64));
			i++;
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
