import java.util.*;
import java.io.*;

public class tsoc16c1p3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		boolean arr[][] = new boolean[a * 2][a * 2];
		for (int i = 0; i < a * 2; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j) == 'g' ? true : false;
			}
		}
		
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
		for(int i=0; i<a*2; i++) {
			for(int j=0; j<a*2; j++) {
				if(arr[i][j]) {
					if(i<a&&j<a) {
						q2++;
					}else if(i < a && j>=a) {
						q1++;
					}else if(i>=a && j<a) {
						q3++;
					}else {
						q4++;
					}
				}
			}
		}
//		System.out.println(q1+" "+q2+" "+q3+" "+q4);
		if(q1>=Math.max(q2, Math.max(q3, q4))) {
			System.out.println(1);
		}else if(q2>=Math.max(q1, Math.max(q3, q4))) {
			System.out.println(2);
		}else if(q3>=Math.max(q1, Math.max(q2, q4))) {
			System.out.println(3);
		}else {
			System.out.println(4);
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
