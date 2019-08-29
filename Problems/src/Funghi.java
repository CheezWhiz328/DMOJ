import java.util.*;
import java.io.*;

public class Funghi {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int arr[] = new int[16];
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
			arr[i+8] = arr[i];
		}int max = 0;
		for(int i=3; i<11; i++) {
			int count = 0;
			for(int j=i-3; j<=i; j++) {
				count+=arr[j];
			}max = Math.max(max, count);
		}System.out.println(max);
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
