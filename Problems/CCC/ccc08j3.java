import java.util.Scanner;

public class ccc08j3 {

	public static void main(String[] args) {
		char[][] map = new char[5][6];
		map[0] = "ABCDEF".toCharArray();
		map[1] = "GHIJKL".toCharArray();
		map[2] = "MNOPQR".toCharArray();
		map[3] = "STUVWX".toCharArray();
		map[4] = "YZ -.%".toCharArray();
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int nextR = 0;
		int preR = 0;
		int nextC = 0;
		int preC = 0;
		int step = 0;
		for (int i = 0; i < S.length(); i++) {
			int C = S.charAt(i);
			for (int r = 0; r < 5; r++) {

				for (int c = 0; c < 6; c++) {

					if (map[r][c] == C) {
						nextR = r;
						nextC = c;

					}

				}
			}

			step += Math.abs(nextR - preR) + Math.abs(nextC - preC);
			preC = nextC;
			preR = nextR;
		}
		step += Math.abs(4 - preR) + Math.abs(5 - preC);
		System.out.println(step);
	}
}
