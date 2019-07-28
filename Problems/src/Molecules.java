import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Molecules {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		String s = sc.next();
		if(s.length()%2==1) {
			System.out.println("No");
			System.exit(0);
		}
		int[] b = new int[26];
		int max = 0;
		for(int i=0; i<s.length(); i++) {
			int c = s.charAt(i)-'a';
			b[c]++;
		}
		for(int i=0; i<26; i++) {
			if(b[i]>max) {
				max = b[i];
			}
		}
		
		if(max<=s.length()/2){
			System.out.println("Yes");
		}else {
			System.out.println("No");
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
