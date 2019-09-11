import java.util.Scanner;

public class tsoc16c1p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		if (str.contains(".")) {
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == '.') {
					str = "\"" + str.substring(0, i) + "\" - " + str.substring(i + 1, str.length());
				}

			}
			System.out.println(str);
		} else {
			String s = sc.nextLine();
			System.out.println("\""+ str + "\" - " + s.substring(0, s.length()).toLowerCase());
		}

	}
}