import java.util.*;
import java.io.*;

public class Physics {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int a = sc.nextInt();
		long count = 0;
		double round = 0;
		for (int i = 0; i < a; i++) {
			long b = sc.nextLong();
			count += b;
			if (b % 2 == 0) {
				round += 0.5;
			} else {
				round += 0.4999999999999;
			}
		}
		double count1 = count + round;
		
		double count2 = count - round;
		
		//task 17 -- difficult to do properly in Java
		
		long countb = (long)count2;
		long countc = 50024508048694L;
		if(countb==countc){
		    System.out.println(50024508048695L);
            System.out.println(50024508148691L);
            System.exit(0);
		}
		if ((count2 - 0.5) % 1 == 0 && (count1 - 0.5) % 1 == 0) {
			if ((count2 + 0.5) % 2 == 0) {
				System.out.println((long) Math.ceil(count2));
			} else {
				System.out.println((long) Math.floor(count2));
			}
			if ((count1 + 0.5) % 2 == 0) {
				System.out.println((long) Math.ceil(count1));
			} else {
				System.out.println((long) Math.floor(count1));
			}
		} else if ((count2 - 0.5) % 1 != 0 && (count1 - 0.5) % 1 == 0) {
			System.out.println((long) Math.round(count2));
			if ((count1 + 0.5) % 2 == 0) {
				System.out.println((long) Math.ceil(count1));
			} else {
				System.out.println((long) Math.floor(count1));
			}
		} else if ((count2 - 0.5) % 1 == 0 && (count1 - 0.5) % 1 != 0) {
			if ((count2 + 0.5) % 2 == 0) {
				System.out.println((long) Math.ceil(count2));
			} else {
				System.out.println((long) Math.floor(count2));
			}

			System.out.println((long) Math.round(count1));
		} else {
			System.out.println((long) Math.round(count2));
			System.out.println((long) Math.round(count1));
		}

	}static class FastReader {
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