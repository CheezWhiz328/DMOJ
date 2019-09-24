import java.util.*;
import java.io.*;

public class ccc14s2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		String arr1[] = new String[a];
		for (int i = 0; i < a; i++) {
			arr1[i] = sc.next();
		}
		String arr2[] = new String[a];
		for (int i = 0; i < a; i++) {
			arr2[i] = sc.next();
		}

		for (int i = 0; i < a; i++) {
			if (arr1[i] == "") {
				continue;
			}
			for (int j = i + 1; j < a; j++) {
				if (arr1[i].equals(arr2[j]) && arr1[j].equals(arr2[i])) {
					arr2[j] = "";
					arr2[i] = "";
					break;
				}
			}
		}
		String s = "";
		for (int i = 0; i < a; i++) {
			s += arr2[i];
//			System.out.print(arr2[i]);
		}
		System.out.println((s.length() == 0) ? "good" : "bad");
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