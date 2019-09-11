import java.util.*;

public class ccc14j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();
		sc.nextLine();
		String inpStr = sc.nextLine();
		int A = 0;
		int B = 0;
		String tmpStr = inpStr.replaceAll("B", "");
		B = inpStr.length() - tmpStr.length();
		A = tmpStr.length();

		if (A == B) {
			System.out.println("Tie");
		} else if (A > B) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}

	}

}