import java.util.*;
import java.io.*;

public class ccc02s3 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean grid[][] = new boolean[x][y];
		char print[][] = new char[x][y];
		for (int i = 0; i < x; i++) {
			String s = sc.next();
			for (int j = 0; j < y; j++) {
				grid[i][j] = s.charAt(j) == '.' ? true : false;
				print[i][j] = s.charAt(j);
			}
		}
		int dirx[] = { 0, 1, 0, -1 };
		int diry[] = { 1, 0, -1, 0 };

		int t = sc.nextInt();
		char[] queue = new char[t];
		for (int i = 0; i < t; i++) {
			queue[i] = sc.next().charAt(0);
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int d = 0; d < 4; d++) {
					boolean valid = true;
					int X = i;
					int Y = j;
					int dir = d;
					if(grid[X][Y]) {
						for (int q = 0; q < t; q++) {
							if(queue[q]=='F') {
								X+=dirx[dir];
								Y+=diry[dir];
							}else if(queue[q]=='R') {
								dir++;
							}else {
								dir--;
							}
							dir+=4;
							dir%=4;
							
							if(X<0 || X>=x || Y<0 || Y>=y || !grid[X][Y]) {
								valid = false;
								break;
							}
						}
					}else {
						valid = false;
					}
					if(valid) {
						print[X][Y] = '*';
//						System.out.println(dirx[dir]+" "+diry[dir]);
					}
				}
				
			}
		}
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(print[i][j]);
			}System.out.println();
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