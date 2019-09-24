import java.util.Scanner;

public class dwite12c1p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			int rc = 0;
			for (int j = 0; j < a * 2; j++) {
				if (j <= a) {
					rc = j;
				} else {
					rc = a * 2 - j;
				}
				for (int k = 0; k < rc; k++) {
					System.out.print("*");
				}
				if (j != 0) {
					System.out.println();
				}
			}

		}
	}
}