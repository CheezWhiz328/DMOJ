import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class marathon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int[] prefixsum = new int[n+1];
		prefixsum[0] = 0;
		for(int i=1; i<=n; i++) {
			prefixsum[i] = sc.nextInt();
			prefixsum[i] += prefixsum[i-1];
		}
		
		int total = prefixsum[n];
		for(int i=0; i<q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(total - (prefixsum[b] - prefixsum[a - 1]));
		}
	}
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
