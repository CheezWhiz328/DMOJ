import java.util.Scanner;

public class ccc16j1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int W = 0;
		for (int i = 0; i < 6; i++) {
			String str = sc.next();
			if (str.equals("W")) {
				W++;
			}

		}

		if (W == 0) {
			System.out.print("-1");
		}

		else if (W == 1 || W == 2) {
			System.out.print("3");
		}

		else if (W == 3 || W == 4) {
			System.out.print("2");
		}

		else if (W == 5 || W == 6) {
			System.out.print("1");
		}

	}

}