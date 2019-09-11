import java.util.Scanner;

public class ccc14j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();

		if (one == 60 & two == 60 & three == 60) {

			System.out.println("Equilateral");

		}

		if (one != two & two != three & one != three & one + two + three == 180) {

			System.out.println("Scalene");
		}

		if (one == two & two != three & one + two + three == 180) {

			System.out.println("Isosceles");
		}

		if (one == three & three != two & one + two + three == 180) {

			System.out.println("Isosceles");
		}

		if (three == two & two != one & one + two + three == 180) {

			System.out.println("Isosceles");
		}

		if (one + two + three != 180) {

			System.out.println("Error");
		}

	}

}