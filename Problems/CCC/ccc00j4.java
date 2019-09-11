import java.util.*;
import java.io.*;

public class ccc00j4 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		LinkedList<Double> river = new LinkedList<Double>();
		for (int i = 0; i < a; i++) {
			river.add(sc.nextDouble());
		}
		while (true) {
//			for(int i=0; i<river.size(); i++) {
//				System.out.print(river.get(i)+" ");
//			}System.out.println();
			int command = sc.nextInt();
			if (command == 77) {
				for(int i=0; i<river.size(); i++) {
					System.out.print(Math.round(river.get(i))+" ");
				}
				break;
			}

			if (command == 99) {
				int i = sc.nextInt();
				int j = sc.nextInt();
				double count = river.get(i-1) * j / 100;
				double count1 =  river.get(i-1) * (100 -j) / 100;
				river.add(i - 1, count);
				river.set(i,  count1);
			}
			if (command == 88) {
				int i = sc.nextInt();
				river.set(i, river.get(i-1)+river.get(i));
				river.remove(i-1);
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
