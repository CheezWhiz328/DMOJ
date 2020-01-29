import java.io.*;
import java.util.*;

public class dwite11c1p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int t = 5;
		while (t-- > 0) {
			String arr[] = sc.nextLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				try {
					for (int j = 0; j < arr[i].length(); j++) {
						Integer.parseInt(arr[i].substring(j, j + 1));
					}
				} catch (Exception NumberFormatException) {
					String s = "";
					for (int j = 0; j < arr[i].length(); j++) {
						s += arr[i].charAt(arr[i].length() - j - 1);
					}
					arr[i] = s;
				}
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[arr.length - i - 1] + " ");
			}
			System.out.println();
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