import java.util.LinkedList;
import java.util.Scanner;

public class countShapes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 5; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean grid[][] = new boolean[b][a];
			for (int i = 0; i < b; i++) {
				String s = sc.next();
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == 'X') {
						grid[i][j] = true;
					}
				}
			}

			int count = 0;
			boolean vis[][] = new boolean[b][a];
			for (int i = 0; i < b; i++) {
				for (int j = 0; j < a; j++) {
					if (grid[i][j] && !vis[i][j]) {
						count++;
						LinkedList<Integer> rowQ = new LinkedList<Integer>();
						LinkedList<Integer> colQ = new LinkedList<Integer>();

						rowQ.add(i);
						colQ.add(j);
						vis[i][j] = true;

						while (!rowQ.isEmpty()) {
							int R = rowQ.poll();
							int C = colQ.poll();

							if (R + 1 < b && !vis[R + 1][C] && grid[R + 1][C]) {
								vis[R + 1][C] = true;
								rowQ.add(R + 1);
								colQ.add(C);
							}

							if (R - 1 >= 0 && !vis[R - 1][C] && grid[R - 1][C]) {
								vis[R - 1][C] = true;
								rowQ.add(R - 1);
								colQ.add(C);
							}

							if (C + 1 < a && !vis[R][C + 1] && grid[R][C + 1]) {
								vis[R][C + 1] = true;
								rowQ.add(R);
								colQ.add(C + 1);
							}

							if (C - 1 >= 0 && !vis[R][C - 1] && grid[R][C - 1]) {
								vis[R][C - 1] = true;
								rowQ.add(R);
								colQ.add(C - 1);
							}

						}
						
//						for(int i1=0; i1<b; i1++) {
//							for(int j1=0; j1<a; j1++) {
//								System.out.print(vis[i1][j1]?1:0);
//							}System.out.println();
//						}System.out.println();

					}
				}
				
			}System.out.println("In rectangle #" + t + " are " + count + " shapes");
//			for(int i=0; i<b; i++) {
//				for(int j=0; j<a; j++) {
//					System.out.print(vis[i][j]?1:0);
//				}System.out.println();
//			}
			

		}

	}
}
