import java.util.Scanner;

public class dwite07c3p1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			int count = 0;
			if (a % 2 == 0) {
				while (a % 2 == 0) {
					a = a / 2;
				}
				count++;
			}

			for (int j = 3; j <= a; j += 2) {
				if (a % j == 0) {
					while(a%j==0) {
						a = a/j;
					}
					count++;
					if (count > 3) {
						break;
					}
				}
			}
			if (count == 3) {
				System.out.println("valid");
			} else {
				System.out.println("not");
			}
		}
	}
}