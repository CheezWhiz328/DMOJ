import java.util.*;
import java.io.*;

public class toweringTowers {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		int[] stack = new int[N];
		for(int i=0; i<N; i++) {
			stack[i] = sc.nextInt();
		}
		
		int ans = 0;
		int[] notdp = new int[N];
		for(int i=0; i<N; i++) {
			int count = 0;
			int get = stack[i];
			for(int j=i-1; j>=0; j--) {
				if(stack[j]>get) {
					count++;
					break;
				}
				
				count++;
			}
			notdp[i] = count;
			System.out.print(notdp[i]+" ");
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
