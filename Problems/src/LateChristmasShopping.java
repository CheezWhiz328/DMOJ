import java.util.*;
import java.io.*;

public class LateChristmasShopping {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		
		int a = sc.nextInt();
		int count = 0;
		int arr[] = new int[10];
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			for(int j=0; j<b; j++) {
				arr[count] =  sc.nextInt();
				count++;
				if(j>0 && arr[j]==arr[j-1]) {
					arr[j-1]+=100+count;
					arr[j]+=101+count;
				}
			}
		}
		
		Arrays.sort(arr);
		boolean y = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				continue;
			}
			
			if(arr[i]==arr[i-1]) {
				y = false;
				break;
			}
		}System.out.println(y ? "NO" : "YES");
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
