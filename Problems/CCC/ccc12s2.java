import java.util.Hashtable;
import java.util.Scanner;

public class ccc12s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
		table.put('I', 1);
		table.put('V', 5);
		table.put('X', 10);
		table.put('L', 50);
		table.put('C', 100);
		table.put('D', 500);
		table.put('M', 1000);

		String S = sc.next();
		char[] A = S.toCharArray();
		int total = 0;
		int pre = 0;
		for (int i = A.length - 1; i > 0; i = i - 2) {
			char r = A[i];
			char a = A[i - 1];
			int n = Character.getNumericValue(a);
			int m = table.get(r);

			if (m < pre && i != A.length - 1) {
				total = total - n * m;
				pre = m;
			} else {
				total = total + n * m;
				pre = m;
			}
		}

		System.out.println(total);
	}

}