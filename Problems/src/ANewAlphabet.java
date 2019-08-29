import java.util.*;
import java.io.*;

public class ANewAlphabet {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		char[] a = sc.nextLine().toUpperCase().toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 65) {
				System.out.print("@");
			}
			else if (a[i] == 66) {
				System.out.print("8");
			}
			else if (a[i] == 67) {
				System.out.print("(");
			}
			else if (a[i] == 68) {
				System.out.print("|)");
			}
			else if (a[i] == 69) {
				System.out.print("3");
			}
			else if (a[i] == 70) {
				System.out.print("#");
			}
			else if (a[i] == 71) {
				System.out.print("6");
			}
			else if (a[i] == 72) {
				System.out.print("[-]");
			}
			else if (a[i] == 73) {
				System.out.print("|");
			}
			else if (a[i] == 74) {
				System.out.print("_|");
			}
			else if (a[i] == 75) {
				System.out.print("|<");
			}
			else if (a[i] == 76) {
				System.out.print("1");
			}
			else if (a[i] == 77) {
				System.out.print("[]\\/[]");
			}
			else if (a[i] == 78) {
				System.out.print("[]\\[]");
			}
			else if (a[i] == 79) {
				System.out.print("0");
			}
			else if (a[i] == 80) {
				System.out.print("|D");
			}
			else if (a[i] == 81) {
				System.out.print("(,)");
			}
			else if (a[i] == 82) {
				System.out.print("|Z");
			}
			else if (a[i] == 83) {
				System.out.print("$");
			}
			else if (a[i] == 84) {
				System.out.print("']['");
			}
			else if (a[i] == 85) {
				System.out.print("|_|");
			}
			else if (a[i] == 86) {
				System.out.print("\\/");
			}
			else if (a[i] == 87) {
				System.out.print("\\/\\/");
			}
			else if (a[i] == 88) {
				System.out.print("}{");
			}
			else if (a[i] == 89) {
				System.out.print("`/");
			}
			else if (a[i] == 90) {
				System.out.print("2");
			}
			else{
				System.out.print(a[i]);
			}
		}

//		String a[] = new String[26];
//		for(int i=65; i<=90; i++) {
//			String b = sc.next();
//			a[i-65] = "if(a[i] == "+i+"){\nSystem.out.print(\""+b+"\");\n}";
//		}
//		for(int i=0; i<26; i++) {
//			System.out.println(a[i]);
//		}
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
