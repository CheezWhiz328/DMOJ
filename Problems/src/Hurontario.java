import java.util.Scanner;

public class Hurontario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int j = 0;
		int E = 0;
		if (a.length() > b.length()) {
			j = b.length();
			for (int i = b.length(); i > 0; i--) {

				String c = a.substring(a.length() - j, a.length());
				String d = b.substring(0, i);
				if (c.equals(d)) {
					E = i;
					break;
				}
//				System.out.println(c + " " + d + " " + E);
				j--;
			}
		} else {
			j = a.length()+1;
			for (int i = 0; i < a.length(); i++) {
				j--;
				String c = a.substring(i, a.length());
				String d = b.substring(0, j);
				if (c.equals(d)) {
					E = j;
					break;
				}
//				System.out.println(c + " " + d + "" + E);
			}

		}
		b = b.substring(E, b.length());

		System.out.println(a + b);
	}
}