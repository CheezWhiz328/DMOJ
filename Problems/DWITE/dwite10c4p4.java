import java.util.*;
import java.io.*;

public class dwite10c4p4 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int xdir[] = {1,0,-1,0};
		int ydir[] = {0,1,0,-1};
		int t = 5;
		while(t-->0) {
			int map[][] = new int[10][10];
			
			for(int i=0; i<10; i++) {
				String s = sc.next();
				for(int j=0; j<10; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			String s = sc.next();
			
			int min = 1<<30;
			for (int i = 0; i < map.length; i++) {

				for (int j = 0; j < map.length; j++) {
	
					int steps[][] = new int[10][10];
					for (int k = 0; k < steps.length; k++) {
						for (int k2 = 0; k2 < steps.length; k2++) {
							steps[k][k2] = 1<<30;
							
						}
						
					}
					
					LinkedList<Integer> row = new LinkedList<Integer>();
					LinkedList<Integer> col = new LinkedList<Integer>();
					row.add(i);
					col.add(0);
					steps[i][0] = 0;
					while(!row.isEmpty()) {
						int x = row.poll();
						int y = col.poll();
						for(int k=0; k<4; k++) {
							if(x+xdir[k]>=0 && x+xdir[k]<10 && y+ydir[k]>=0 && y+ydir[k]<10 && steps[x+xdir[k]][y+ydir[k]] > steps[x][y] && Math.abs(map[x+xdir[k]][y+ydir[k]] - map[x][y])<=1) {
								steps[x+xdir[k]][y+ydir[k]] = steps[x][y]+1;
								row.add(x+xdir[k]);
								col.add(y+ydir[k]);
							}
						}
					}
//					System.out.println(steps[j][9]);
					if(steps[j][9] < min) {
						min = steps[j][9];
					}
				}
				
			}
			
			System.out.println(min==1<<30 ? "IMPOSSIBLE" : min);
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
