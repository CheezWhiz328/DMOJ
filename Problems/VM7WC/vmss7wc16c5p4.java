import java.util.*;
import java.io.*;

public class vmss7wc16c5p4 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();

		int arr[] = new int[n + 1];
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		arr[n - x] = 1;
		arr[n - y] = 1;
		arr[n - z] = 1;
		for (int i = n; i >= 0; i--) {
			if (arr[i] != 0) {
				if (i - x >= 0 && arr[i - x] < arr[i] + 1) {
					arr[i - x] = arr[i] + 1;
				}
				if (i - y >= 0 && arr[i - y] < arr[i] + 1) {
					arr[i - y] = arr[i] + 1;
				}
				if (i - z >= 0 && arr[i - z] < arr[i] + 1) {
					arr[i - z] = arr[i] + 1;
				}
			}
		}
//		for(int i=0; i<n; i++) {
//			System.out.print(arr[i]+" ");
//		}System.out.println();
		System.out.println(arr[0]);
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
