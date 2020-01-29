import java.util.*;
import java.io.*;

public class cco07p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		Set<String> set = new HashSet<String>();
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int arr[] = new int[6];
			for(int j=0; j<6; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			String s = "";
			for(int j=0; j<6; j++) {
				s+=arr[j];
			}
			set.add(s);
			if(set.size()!=i) {
				System.out.println("Twin snowflakes found.");
				System.exit(0);
			}
		}
		
		System.out.println("No two snowflakes are alike.");
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
