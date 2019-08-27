import java.util.Scanner;

public class AceIsBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		long a = sc.nextLong();
		long b = sc.nextLong();
		if (a % 2 == 1) {
			a--;
		}
		for (long i = a; i <= b; i += 2) {
			String c = Long.toHexString(i);
			if (c.contains("0") || c.contains("1") || c.contains("2") || c.contains("3") || c.contains("4")
					|| c.contains("5") || c.contains("6") || c.contains("7") || c.contains("8") || c.contains("9")
					|| c.contains("b") || c.contains("d") || c.contains("f")) {

			} else {
//				System.out.println(c + " " + i);
				count++;
			}
			if (i == 14) {
				i = 168;
			}
			if (i == 238) {
				i = 2728;
			}
			if (i == 3822) {
				i = 43688;
			}
			if (i == 61166) {
				i = 699048;
			}
			if (i == 978670) {
				i = 11184808;
			}
			if (i == 15658734) {
				i = 178956968;
			}
			if (i == 250539758) {
				i = 2863311528L;
			}if(i == 4008636142L) {
				i = 45812984488L;
			}
		}
		System.out.println(count);
	}
}
