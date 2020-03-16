import java.io.*;
import java.util.*;

public class ccc03s2 {
	static boolean check(char a) {
		if (a == 'a') {
			return true;
		}
		if (a == 'e') {
			return true;
		}
		if (a == 'i') {
			return true;
		}
		if (a == 'o') {
			return true;
		}
		if (a == 'u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int t = sc.nextInt();
		while (t-- > 0) {
			String arr[] = new String[4];
			for (int i = 0; i < 4; i++) {
				String s = sc.nextLine().toLowerCase();
				s = s.substring(s.lastIndexOf(" ") + 1);
				for (int j = s.length() - 1; j >= 0; j--) {
					arr[i] += s.charAt(j);
					if (check(s.charAt(j))) {
						break;
					}
				}
			}
			if (arr[0].equals(arr[1]) && arr[1].equals(arr[2]) && arr[2].equals(arr[3])) {
				System.out.println("perfect");
			} else if ((arr[0].equals(arr[1]) && arr[2].equals(arr[3]))) {
				System.out.println("even");
			} else if (arr[0].equals(arr[2]) && arr[1].equals(arr[3])) {
				System.out.println("cross");
			} else if (arr[0].equals(arr[3]) && arr[1].equals(arr[2])) {
				System.out.println("shell");
			} else {
				System.out.println("free");
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
