import java.util.Scanner;

public class ccc04s1 {
	static boolean check(String a, String b) {
		if (a.startsWith(b) || a.endsWith(b)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();

			if (check(a, b) || check(b, a) || check(a, c) || check(c, a) || check(b, c) || check(c, b)) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
