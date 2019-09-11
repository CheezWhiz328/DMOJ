import java.util.Scanner;

public class ccc19s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		int[][] a = new int[2][2];
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'V') {
				int k = a[0][0];
				a[0][0] = a[0][1];
				a[0][1] = k;
				int k1 = a[1][1];
				a[1][1] = a[1][0];
				a[1][0] = k1;
			}
			if (s.charAt(i) == 'H') {
				int k = a[0][0];
				a[0][0] = a[1][0];
				a[1][0] = k;
				int k1 = a[1][1];
				a[1][1] = a[0][1];
				a[0][1] = k1;
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
