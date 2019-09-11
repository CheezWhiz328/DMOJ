import java.util.Scanner;

public class ccc15j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inpStr = sc.nextLine();
		int HappyCount = 0;
		int SadCount = 0;
		String tmpStr = inpStr.replaceAll(":-\\)", "AA");
		HappyCount = inpStr.length() - tmpStr.length();
		tmpStr = inpStr.replaceAll(":-\\(", "AA");
		SadCount = inpStr.length() - tmpStr.length();

		if (HappyCount == SadCount & HappyCount > 0) {
			System.out.println("unsure");
		}

		if (HappyCount > SadCount) {
			System.out.println("happy");
		}

		if (SadCount > HappyCount) {
			System.out.println("sad");
		}

		if (HappyCount == 0 & SadCount == 0) {
			System.out.println("none");
		}

	}
}
