import java.util.*;
import java.io.*;

public class ObservingFrogs {
	static long square(long n) {
        if (n == 0)  
            return 0; 
      
        if (n < 0)  
            n = -n; 
        long x = n >> 1; 
       
        if (n % 2 != 0) 
            return ((square(x) << 2)  
                    + (x << 2) + 1); 
        return (square(x) << 2); 
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int N = sc.nextInt();
		System.out.println(square(N) >> 1);
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
