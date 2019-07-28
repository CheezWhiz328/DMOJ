import java.util.Scanner;

public class BackToSchool16Harambe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String b = S.replace(" ", "");
		char[] a = b.toCharArray();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 96)
				count++;
		}

		if (b.length() % 2 == 0) {
			if (count > b.length() / 2) {
				System.out.println(S.toLowerCase());
			}
			if (count < b.length() / 2) {
				System.out.println(S.toUpperCase());
			} else {
				System.out.println(S);
			}
		}else {
			if (count > (b.length()-1) / 2) {
				System.out.println(S.toLowerCase());
			}
			if (count <= (b.length()-1) / 2) {
				System.out.println(S.toUpperCase());
			}
		}

	}
}
