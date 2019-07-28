import java.util.Scanner;

public class forever {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		while (true) {
			int b = Integer.toString(a).length();
			if (b == 1) {
				if (a == 1) {

					a = 3;
				} else if (a == 2) {

					a = 3;
				} else if (a == 3) {

					a = 5;
				} else if (a == 4) {
					a = 4;
				} else if (a == 5) {

					a = 4;
				} else if (a == 6) {

					a = 3;
				} else if (a == 7) {

					a = 5;
				} else if (a == 8) {

					a = 5;
				} else if (a == 9) {

					a = 4;
				}
			}
			if (b == 2 && a < 20) {
				if (a == 10) {

					a = 3;
				} else if (a == 11) {

					a = 6;
				} else if (a == 12) {

					a = 6;
				} else if (a == 13) {

					a = 8;
				} else if (a == 14) {

					a = 8;
				} else if (a == 15) {

					a = 7;
				} else if (a == 16) {

					a = 7;
				} else if (a == 17) {
					a = 9;
				} else if (a == 18) {
					a = 8;
				} else if (a == 19) {
					a = 8;
				}
			}
			if (b == 2 && a >= 20) {
				if (a == 20) {
					a = 6;
				} else if (a == 30) {
					a = 6;
				} else if (a == 40) {
					a = 5;
				} else if (a == 50) {
					a = 5;
				} else if (a == 60) {
					a = 5;
				} else if (a == 70) {
					a = 7;
				} else if (a == 80) {
					a = 6;
				} else if (a == 90) {
					a = 6;
				}
			}
			if (a == 100) {
				a = 10;
			} else if (a == 101) {
				a = 13;
			} else if (a == 200) {
				a = 10;
			} else if (a == 1000) {
				a = 11;
			}
			
			System.out.println(a);
			if(a==4) {
				System.exit(0);
			}
		}
	}
}
