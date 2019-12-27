import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class denoun2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
		int n = sc.nextInt();
		Pattern pattern = Pattern.compile("([A-Z-ÄÖÜ][/\\p{L}/u]*)");
		while(n-->0) {
			String s = sc.nextLine();
			Matcher matcher = pattern.matcher(s);
			while (matcher.find()) {
			    out.println(matcher.group(1));
			}
		}
		out.close();
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
