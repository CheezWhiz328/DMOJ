import java.util.Scanner;

public class EquationSolver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		s = s.substring(0, s.length() - 1);
		String[] a = s.split(" ");
		int b = 0;
		int count = Integer.parseInt(a[0]);
		for (int i = 2; i < a.length; i += 2) {
			if (a[i - 1].contains("P")) {
				b = 1;
			} else {
				b = -1;
			}
			count += b * Integer.parseInt(a[i]);
		}
		System.out.println(count);
	}
}
