import java.util.Scanner;

public class ccc00j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int begin = sc.nextInt();
		int days = sc.nextInt();
		System.out.printf("Sun Mon Tue Wed Thr Fri Sat\n");
		System.out.printf("%2s", "");
		for (int i = 0; i < begin - 1; i++)
			System.out.printf("%4s", "");

		for (int i = 1; i <= days; i++) {
			if (i == days) {
				if (i > 9) {
					System.out.printf("%2s", i + "\n");
					break;
				} else {
					System.out.printf("%1s", i + "\n");
					break;
				}
			}

			if ((i + begin - 1) % 7 == 0) {
				if (i > 9) {
					System.out.printf("%4s", i +"\n ");
				} else {
					System.out.printf("%2s", i + "\n  ");
				}
			} else {

				if (i >= 9)
					System.out.printf("%2s", i +"  ");
				else
					System.out.printf("%2s", i + "   ");

			}

		}

	}
}