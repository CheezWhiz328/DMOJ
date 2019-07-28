import java.util.Scanner;

public class brackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int lcount = 0;
		int rcount = 0;
		char[] s = a.toCharArray();

		if (a.length() % 2 == 1) {
			System.out.println("impossibruh");
			System.exit(0);
		}
		for (int i = 0; i < a.length(); i++) {

			if (s[i] == '(') {
				lcount++;
			} else if (s[i] == ')') {
				rcount++;
			}
		}
		if (lcount != rcount) {
			System.out.println("impossibruh");
			System.exit(0);
		}

		for (int i = 0; i < a.length(); i++) {
			if (s[i] == '?') {
				if (lcount > rcount) {
					s[i] = ')';
				} else if (lcount <= rcount) {
					s[i] = '(';
					lcount--;
				}
			}
			System.out.print(s[i]);
		}
	}
}
