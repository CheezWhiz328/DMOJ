import java.util.*;
import java.io.*;

public class Catch {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int arr[] = new int[3];
		int a1 = sc.nextInt(), a2 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt(), c1 = sc.nextInt(),
				c2 = sc.nextInt();
		arr[0] = (a1 - b1) * (a1 - b1) + (a2 - b2) * (a2 - b2);
		arr[1] = (b1 - c1) * (b1 - c1) + (b2 - c2) * (b2 - c2);
		arr[2] = (a1 - c1) * (a1 - c1) + (a2 - c2) * (a2 - c2);
		Arrays.sort(arr);
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
