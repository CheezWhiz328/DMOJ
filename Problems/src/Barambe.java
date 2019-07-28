import java.util.Scanner;

public class Barambe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		for (int i = 0; i < 26; i++) {

			char a = (char) (i + 65);
			str = str.replace(" " + Character.toString(a), ". " + Character.toString(a));
		}
		str += ".";
		System.out.println(str);

	}
}
