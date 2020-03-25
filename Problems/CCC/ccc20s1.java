import java.util.*;
import java.io.*;

public class ccc20s1 {
	static class edge implements Comparable<edge> {
		int dis;
		int w;

		edge(int dis1, int w1) {
			dis = dis1;
			w = w1;
		}

		public int compareTo(edge o) {
			return dis - o.dis;
		}
	}
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		
		
		edge arr[] = new edge[n];
		for(int i=0; i<n; i++) {
			arr[i] = new edge(sc.nextInt(), sc.nextInt());
		}
		
		Arrays.sort(arr);
		
//		for(int i=0; i<n; i++) {
//			System.out.println(arr[i].dis+" "+arr[i].w);
//		}
		
//		for(int i=0; i<n-1; i++) {
//			System.out.println(arr[i].dis+" "+arr[i+1].dis);
//			System.out.println(arr[i].w+" "+arr[i+1].w);
//		}
		
		
		
		double max = 0;
		for(int i=0; i<n-1; i++) {
			max = Math.max(max, 1.0 * Math.abs(arr[i].w-arr[i+1].w) / (1.0 * (arr[i+1].dis-arr[i].dis)));
		}
		
		System.out.println(max);
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
