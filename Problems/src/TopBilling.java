import java.util.LinkedList;
import java.util.Scanner;

public class TopBilling {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ROW = sc.nextInt();
		int COL = sc.nextInt();

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (i == ROW - 1 && j == 0) {
					System.out.print("S");
				}
				else if (i == ROW - 2 && j == COL - 1) {
					System.out.print("E");
				} else if (i == 0 || i == ROW - 1) {
					System.out.print(".");
				}else if (j<ROW-i-1) {
					System.out.print(".");
				}else {
					System.out.print(j==COL-1 ? "." : "#");
				}
			}
			System.out.println();
		}

	}
}
