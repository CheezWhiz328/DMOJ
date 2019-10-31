import java.util.*;
import java.io.*;

public class vmss7wc16c2p2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		String s = sc.next();
		
		int psa[] = new int[s.length()+1];
		for(int i=1; i<=s.length(); i++) {
			if(s.charAt(i-1)=='G') {
				psa[i]++;
			}
			psa[i]+=psa[i-1];
		}
		
		int t = sc.nextInt();
		while(t-->0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(psa[r+1]-psa[l]);
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
