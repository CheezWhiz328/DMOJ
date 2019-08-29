import java.util.Scanner;

public class ASCIIRhombus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int t = 0; t < 5; t++) {
			int a = sc.nextInt();
			a += 2;
			for (int i = 1; i < a / 2 + 1; i++) {
				for (int j = 1; j < a / 2 + 1 - i; j++) {
					System.out.print(".");
				}
				for (int j = 0; j < i * 2 - 1; j++) {
					System.out.print("#");
				}
				for (int j = 0; j < a / 2 - i; j++) {
					if (j == 0 && i == 0) {

					}
					System.out.print(".");
				}
				System.out.println();
			}
			for (int i = a / 2 - 1; i > 0; i--) {
				for (int j = 1; j < a / 2 + 1 - i; j++) {
					System.out.print(".");
				}
				for (int j = 0; j < i * 2 - 1; j++) {
					System.out.print("#");
				}
				for (int j = 0; j < a / 2 - i; j++) {
					if (j == 0 && i == 0) {
						j++;
					}
					System.out.print(".");
				}
				System.out.println();
			}
		}

	}
}