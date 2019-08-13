import java.util.*;
import java.io.*;

public class TakeANumber {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int num = sc.nextInt();
		int tcount = 0;
		int scount = 0;
		while(true){
			String b = sc.next();
			if(b.equals("EOF")) {
				break;
			}
			if(b.equals("TAKE")) {
				tcount++;
				num++;
				if(num==1000) {
					num = 0;
				}
			}
			if(b.equals("SERVE")) {
				scount++;
			}
			if(b.equals("CLOSE")) {
				System.out.println(tcount+" "+(tcount-scount)+" "+num);
				tcount = 0;
				scount = 0;
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
