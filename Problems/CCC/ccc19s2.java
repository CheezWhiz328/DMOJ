import java.util.Scanner;

public class ccc19s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		boolean prime = true;
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			for (int z = 0; z < b; z++) {
				prime = true;
				for (int k = 2; k <= Math.sqrt(b + z); k++) {
					if ((b + z) % k == 0) {
						prime = false;
						break;
					}
				}
				for (int u = 2; u <= Math.sqrt(b - z); u++) {
					if ((b - z) % u == 0) {
						prime = false;
						break;
					}
				}
				if (prime) {
					System.out.println((b + z) + " " + (b - z));
					break;
				}
			}
		}

	}
}