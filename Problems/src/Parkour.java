import java.util.Scanner;

public class Parkour {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long ER = sc.nextLong();
		long EC = sc.nextLong();
		long ERend = sc.nextInt() + ER;
		long ECend = sc.nextInt() + EC;
		long min = sc.nextLong();

		long minSteps = 1 << 60L;
		long end = Math.max(ERend, ECend);
		long bEnd = Math.max(ER, EC);
		long step1 = bEnd % 2 == 0 ? bEnd / 2 : (bEnd + 1) / 2;
		minSteps = Math.min(minSteps, step1);

		System.out.println(minSteps < min ? "YES" : "NO");

	}
}