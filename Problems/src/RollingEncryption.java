import java.util.Scanner;

public class RollingEncryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String S = sc.next();
		char[] k = new char[S.length()];
		for (int i = 0; i < S.length(); i++) {
			k[i] = S.charAt(i);
			if (i < a) {
				System.out.print(S.charAt(i));
			} else {
				char[] freq = new char[26];
				System.out.println();
				int shift = 0;
				int hi = 123;

				for (int j = a - 1; j >= 0; j--) {
					System.out.print(S.charAt(i - j - 1) - 97);
					freq[S.charAt(i - j - 1) - 97]++;

					if (freq[S.charAt(i - j - 1) - 97] > shift) {
						shift = S.charAt(i - j - 1) - 96;
						hi = shift;

					}
				}
				System.out.print(" " + shift + " " + hi + " ");
				shift %= 26;
				System.out.print(" " + S.charAt(i) + " " + (char) (S.charAt(i) + shift));
			}

		}

	}
}
