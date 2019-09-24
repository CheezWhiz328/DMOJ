import java.util.*;
import java.io.*;

public class ccc03s3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int c = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean grid[][] = new boolean[a][b];
		for (int i = 0; i < a; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '.') {
					grid[i][j] = true;
				}
			}
		}

		int arr[] = new int[4000];
		int arrInd = 0;
		int count1 = 0;
		boolean vis[][] = new boolean[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				if (grid[i][j] && !vis[i][j]) {
					count1++;
					int count = 0;

					LinkedList<Integer> rowQ = new LinkedList<Integer>();
					LinkedList<Integer> colQ = new LinkedList<Integer>();

					rowQ.add(i);
					colQ.add(j);
					vis[i][j] = true;

					while (!rowQ.isEmpty()) {
						int R = rowQ.poll();
						int C = colQ.poll();

						if (R + 1 < a && !vis[R + 1][C] && grid[R + 1][C]) {
							vis[R + 1][C] = true;
							rowQ.add(R + 1);
							colQ.add(C);
						}

						if (R - 1 >= 0 && !vis[R - 1][C] && grid[R - 1][C]) {
							vis[R - 1][C] = true;
							rowQ.add(R - 1);
							colQ.add(C);
						}

						if (C + 1 < b && !vis[R][C + 1] && grid[R][C + 1]) {
							vis[R][C + 1] = true;
							rowQ.add(R);
							colQ.add(C + 1);
						}

						if (C - 1 >= 0 && !vis[R][C - 1] && grid[R][C - 1]) {
							vis[R][C - 1] = true;
							rowQ.add(R);
							colQ.add(C - 1);
						}

						count++;

					}
					arr[arrInd] = count;
					arrInd++;

				}
			}

		}

		Arrays.sort(arr);
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (c - arr[i] < 0 || i == arr.length - 1 - count1) {
				if (count == 1) {
					System.out.println(count + " room, " + c + " square metre(s) left over");
					System.exit(0);
				}
				System.out.println(count + " rooms, " + c + " square metre(s) left over");
				System.exit(0);
			} else {
				c -= arr[i];
				count++;
			}
//			if(arr[i]!=0) {
//				System.out.println(arr[i]);
//			}
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