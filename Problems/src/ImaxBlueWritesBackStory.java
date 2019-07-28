import java.util.*;
import java.io.*;

public class ImaxBlueWritesBackStory {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int arr[] = new int[100000];
		int prime[] = new int[31630];
		prime[2] = -999999;
		for(int i=4; i<31630; i+=2) {
			prime[i]++;
		}
		for(int i=3; i<31630; i+=2) {
			if(prime[i]==0) {
				prime[i] = -999999;
				for(int j=2*i; j<31630; j+=i) {
					prime[j]++;
				}
			}
		}
		LinkedList<Integer> primeprime = new LinkedList<Integer>();
		primeprime.add(2);
		for(int i=3; i<=31630; i+=2) {
			if(prime[i]<0) {
				primeprime.add(i);
			}
			
		}
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int iii=0; iii<Q; iii++) {
			int P = sc.nextInt();
			if(P==1) {
				int i = sc.nextInt();
				int x = sc.nextInt();
				arr[i] = x;
			}else {
				int i = sc.nextInt();
				int j = sc.nextInt();
				LinkedList<Integer> a = new LinkedList<Integer>();
				a.add(1);
				for(int l=0; l<primeprime.size(); l++) {
					
					if(arr[i]%primeprime.get(l)==0) {
//						System.out.print(primeprime.get(l)+" ");
						a.add(primeprime.get(l));
					}
				}
				boolean zero = false;
				for(int l=i; l<=j ; l++) {
					if(arr[l]==0) {
						zero = true;
						break;
					}
					for(int z=0; z<a.size(); z++) {
						if(arr[l]%a.get(z)!=0) {
							a.remove(a.get(z));
						}
					}
				}
				int product = 1;
				for(int z=0; z<a.size(); z++) {
					product *= a.get(z);
				}
				if(zero) {
					System.out.println(0);
				}else {
					System.out.println(product);
				}
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
