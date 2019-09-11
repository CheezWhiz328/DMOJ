import java.util.Scanner;

public class ccc15s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int J = sc.nextInt();
		int player = sc.nextInt();

		String[] size = new String[J];

		for (int i = 0; i < J; i++) {
			size[i] = sc.next();
		}

		int count = 0;
		for (int i = 0; i < player; i++) {
			String s = sc.next();
			int n = sc.nextInt();
			if (s.equals("S") && !size[n - 1].equals("")) {
				size[n - 1] = "";
				count++;
			} else if (s.equals("M") && (size[n - 1].equals("L") || size[n - 1].equals("M"))) {
				size[n - 1] = "";
				count++;
			} else if (s.equals("L") && size[n - 1].equals("L")) {
				size[n - 1] = "";
				count++;
			}
		}
		System.out.println(count);

	}
}