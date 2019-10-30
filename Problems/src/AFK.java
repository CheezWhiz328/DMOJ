import java.util.*;
import java.io.*;

public class AFK {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean grid[][] = new boolean[b][a];
			int BR = 0, BC = 0, ER = 0, EC = 0;
			for(int i=0; i<b; i++) {
				String s = sc.next();
				for(int j=0; j<a; j++) {
					if(s.charAt(j)=='O') {
						grid[i][j] = true;
					}else if(s.charAt(j)=='C') {
						BR = i;
						BC = j;
						grid[i][j] = true;
					}else if(s.charAt(j)=='W') {
						ER = i;
						EC = j;
						grid[i][j] = true;
					}
				}
			}
			
			int steps[][] = new int[b][a];
			for(int i=0; i<b; i++) {
				for(int j=0; j<a; j++) {
					steps[i][j] = 1<<30;
				}
			}
			
			steps[BR][BC] = 0;
			LinkedList<Integer> row = new LinkedList<Integer>();
			LinkedList<Integer> col = new LinkedList<Integer>();
			row.add(BR);
			col.add(BC);
			while(!row.isEmpty()) {
				int x = row.poll();
				int y = col.poll();
				if(x+1<b && grid[x+1][y] && steps[x+1][y]> steps[x][y]+1) {
					steps[x+1][y] = steps[x][y]+1;
					row.add(x+1);
					col.add(y);
				}
				if(x-1>=0 && grid[x-1][y] && steps[x-1][y]> steps[x][y]+1) {
					steps[x-1][y] = steps[x][y]+1;
					row.add(x-1);
					col.add(y);
				}
				if(y+1<a && grid[x][y+1] && steps[x][y+1]> steps[x][y]+1) {
					steps[x][y+1] = steps[x][y]+1;
					row.add(x);
					col.add(y+1);
				}
				if(y-1>=0 && grid[x][y-1] && steps[x][y-1]> steps[x][y]+1) {
					steps[x][y-1] = steps[x][y]+1;
					row.add(x);
					col.add(y-1);
				}
			}
			System.out.println(steps[ER][EC] >= 60 ? "#notworth": steps[ER][EC]);
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
