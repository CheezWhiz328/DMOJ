import java.util.*;
import java.io.*;

public class ImaxBlueWritesBackStoryV2 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int N = sc.nextInt();
		int Q = sc.nextInt();
		int arr[] = new int[1000000];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for (int iii = 0; iii < Q; iii++) {
			int P = sc.nextInt();
			if (P == 1) {
				int i = sc.nextInt();
				int x = sc.nextInt();
				arr[i] = x;
			} else {
				int i = sc.nextInt();
				int j = sc.nextInt();
				if (i == j && arr[i] == 0) {
					System.out.println(0);
				} else {
					LinkedList<Integer> a = new LinkedList<Integer>();
					a.add(1);
					int min = Integer.MAX_VALUE;
					for(int z=i; z<=j; z++) {
						if(arr[z]<min && arr[z]!=0) {
							
							min = arr[z];
						}
					}
					for (int z = 2; z <= min; z++) {
						if (arr[i] % z == 0) {
							a.add(z);
						}
					}
					for (int z = i; z <= j; z++) {
						if(arr[z]==0) {
							z++;
						}
						for (int z1 = 0; z1 < a.size(); z1++) {
							if (arr[z] % a.get(z1) != 0) {
								a.remove(a.get(z1));
								if(a.size()==1) {
									break;
								}
							}
						}
					}

					System.out.println(a.get(a.size() - 1));
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
