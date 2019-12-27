import java.util.*;
import java.io.*;

public class ccc04s2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];
		int rank[] = new int[n];
		Arrays.fill(rank, 1);

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				int a = sc.nextInt();
				arr[j] += a;
				
			}
			
			int min[] = arr.clone();
			Arrays.sort(min);
			for(int i1=0; i1<n; i1++) {
				int ind = i1;
				for(int j1=n-1; j1>=0; j1--) {
					if(arr[ind]==min[j1]) {
						rank[ind] = Math.max(n - j1, rank[ind]);
						break;
					}
				}
			}
//			for(int i1=0; i1<n; i1++) {
//				System.out.print(arr[i1]+" ");	
//			}System.out.println();
		}
		int ans = -(1 << 30);
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, arr[i]);
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == ans) {

				System.out.println(
						"Yodeller " + (i + 1) + " is the TopYodeller: score " + arr[i] + ", worst rank " + rank[i]);
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
