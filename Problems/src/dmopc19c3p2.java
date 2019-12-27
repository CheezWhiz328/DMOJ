import java.util.*;
import java.io.*;

public class dmopc19c3p2 {
	static int arr[] = new int[26];

	static long fac(int n) {
		if (n == 0) {
			return 1;
		}
		long fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '*') {
				arr[s.charAt(i) - 'a']++;
			}
		}

		if (k == 0) {
			long fac = fac(n);
			for (int i = 0; i < 26; i++) {
				fac /= 1L * fac(arr[i]);
			}
			System.out.println(fac);
		} else if (k == 1) {
			long count = 0;
			for (int i = 0; i < 26; i++) {
				arr[i]++;
				long fac = fac(n);
				for (int j = 0; j < 26; j++) {
					fac /= 1L * fac(arr[j]);
				}
				count += fac;
				arr[i]--;
			}
			System.out.println(count);
		} else {
			long count = 0;
			for (int i = 0; i < 26; i++) {
				for (int i1 = i; i1 < 26; i1++) {
					arr[i]++;
					arr[i1]++;
					long fac = fac(n);
					for (int j = 0; j < 26; j++) {
						fac /= fac(arr[j]);
					}
					count += fac;
					arr[i]--;
					arr[i1]--;
				}
			}
			System.out.println(count);
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
