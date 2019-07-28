import java.util.*;
import java.io.*;

public class ASpecialCharacter {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		
		int[] c = new int[3];
		for(int i=0; i<3; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);
		int k = sc.nextInt();

		for(int i=0; i<k; i++) {
			if(c[0]==c[2]) {
				break;
			}
			c[0]++;
			c[2]--;
			Arrays.sort(c);	
		}
		long product = 1;
		for(int i=0; i<3; i++) {
			product *= c[i] + 1;
		}System.out.println(product);
		

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
