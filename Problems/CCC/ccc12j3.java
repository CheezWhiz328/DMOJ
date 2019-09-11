import java.util.Scanner;

public class ccc12j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("*");
			}
			for (int k = 0; k < a; k++) {
				System.out.printf("x");
			}
			for (int l = 0; l < a; l++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf(" ");
			}
			for (int k = 0; k < a; k++) {
				System.out.printf("x");
			}
			for (int l = 0; l < a; l++) {
				System.out.printf("x");
			}
			System.out.println();
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("*");
			}
			for (int k = 0; k < a; k++) {
				System.out.printf(" ");
			}
			for (int l = 0; l < a; l++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}
}