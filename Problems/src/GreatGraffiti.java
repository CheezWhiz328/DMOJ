import java.util.*;
import java.io.*;

public class GreatGraffiti {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		if(a.length()==4) {
			System.out.println(0);
		}else if(a.contains("MOJ")||a.contains("DMO")||a.contains("DMJ")||a.contains("DOJ")) {
			System.out.println(1);
		}else if(a.contains("DM")||a.contains("DO")||a.contains("DJ")||a.contains("MO")||a.contains("MJ")||a.contains("OJ")) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
//		if(a.contains("DMOJ")) {
//			System.out.print("0");
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