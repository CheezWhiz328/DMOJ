import java.util.*;
import java.io.*;

public class ccc15s3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean arr[] = new boolean[a];
		int arr1[] = new int[b];
		for(int i=0; i<b; i++) {
			arr1[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0; i<b; i++) {
			for(int j=arr1[i]-1; j>=0; j--) {
				if(!arr[j]) {
					count++;
					arr[j] = true;
//					System.out.println(j);
					break;
				}if(j==0) {
					System.out.println(count);
					System.exit(0);
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
