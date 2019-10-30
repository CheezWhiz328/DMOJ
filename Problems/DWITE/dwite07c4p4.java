import java.util.*;
import java.io.*;

public class dwite07c4p4 {
	static boolean inBounds(int x, int y) {
		if (x >= 0 && x < 10 && y < 10 && y >= 0) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int xdir[] = { 1, 1, 0, -1, -1, -1, 0, 1 };
		int ydir[] = { 0, 1, 1, 1, 0, -1, -1, -1 };
		
//		boolean test[][] = new boolean[3][3];
//		for(int i=0; i<8; i++) {
//			test[1+xdir[i]][1+ydir[i]] = true;
//		}
//		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(test[i][j] ? 't' : 'f');
//			}System.out.println();
//		}
		
		int t = 5;
		while (t-- > 0) {
			int BR = 0, BC = 0, ER = 0, EC = 0;
			boolean beg = false;
			boolean map[][] = new boolean[10][10];
			for (int i = 0; i < 10; i++) {
				String s = sc.next();
				for (int j = 0; j < s.length(); j++) {
					map[i][j] = s.charAt(j) != '#' ? true : false;
					if (s.charAt(j) == 'X' && !beg) {
						BR = i;
						BC = j;
						beg = true;
					} else if (s.charAt(j) == 'X' && beg) {
						ER = i;
						EC = j;
					}
				}
			}

			LinkedList<Integer> row = new LinkedList<Integer>();
			LinkedList<Integer> col = new LinkedList<Integer>();

			int step[][] = new int[10][10];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					step[i][j] = 1 << 30;
				}
			}

			step[BR][BC] = 0;

			row.add(BR);
			col.add(BC);

			while (!row.isEmpty()) {
				int x = row.poll();
				int y = col.poll();
//				System.out.println(x+" "+y);
				for (int i = 0; i < 8; i++) {
					if (inBounds(x + xdir[i], y + ydir[i]) && step[x + xdir[i]][y + ydir[i]] > step[x][y] + 1
							&& map[x + xdir[i]][y + ydir[i]]) {
						step[x + xdir[i]][y + ydir[i]] = step[x][y] + 1;
						row.add(x + xdir[i]);
						col.add(y + ydir[i]);
					}
				}
			}
			
//			for(int i=0; i<10; i++) {
//				for(int j=0; j<10; j++) {
//					System.out.print((step[i][j]==1<<30 ? -1 : step[i][j])+" ");
//				}System.out.println();
//			}
			
			System.out.println(step[ER][EC]);
			String s = sc.next();
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
