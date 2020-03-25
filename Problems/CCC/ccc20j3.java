import java.io.*;
import java.util.*;

public class ccc20j3 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int minx = 1<<30;
		int miny = 1<<30;
		int maxx = 0;
		int maxy = 0;
		while(n-->0) {
			String s[] = sc.next().split(",");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			minx = Math.min(minx, a);
			miny = Math.min(miny, b);
			maxx = Math.max(maxx, a);
			maxy = Math.max(maxy, b);
		}
		minx--;
		miny--;
		maxx++;
		maxy++;
		System.out.println(minx+", "+miny);
		System.out.println(maxx+", "+maxy);
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


