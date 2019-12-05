import java.util.*;
import java.io.*;

public class ccc96s2 {
	static String diff(String str1, String str2) {
		String str = "";

		str1 = new StringBuilder(str1).reverse().toString();
		str2 = new StringBuilder(str2).reverse().toString();

		int carry = 0;

		int ind = 0;

		int sub = str1.charAt(ind) - str2.charAt(ind) - carry;

		if (sub < 0) {
			sub += 10;
			carry = 1;
		} else {
			carry = 0;
		}
		str += (char) (sub + '0');

		for (int i = 1; i < str1.length(); i++) {
			sub = str1.charAt(i) - '0' - carry;

			if (sub < 0) {
				sub += 10;
				carry = 1;
			} else
				carry = 0;

			str += (char) (sub + '0');
		}

		return new StringBuilder(str).reverse().toString().replaceFirst("^0+(?!$)", "");
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String s1 = s;
			while (s.length() > 2) {
				System.out.println(s);
				String s2 = s.substring(s.length() - 1);
				s = diff(s.substring(0, s.length() - 1), s2);
			}
			if (s.length() == 2) {
				System.out.println(s);
			}
			if (s.equals("11")) {
				System.out.println("The number " + s1 + " is divisible by 11.");
			} else {

				System.out.println("The number " + s1 + " is not divisible by 11.");
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
