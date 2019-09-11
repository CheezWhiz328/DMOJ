import java.util.Scanner;
import java.util.StringTokenizer;

public class ccc04s3 {
	static String[][] formula = new String[10][9];
	static int[][] value = new int[10][9];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				formula[i][j] = sc.next(); // contains real value or formula
				value[i][j] = -1;
			}
		}

		boolean change = true;
		while (change) // change is true represent
		// still some cell has no direct dependency on value
		{
			change = false;
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 9; j++) {
					StringTokenizer t = new StringTokenizer(formula[i][j], "+");
					int v = 0;
					int x = 0;
					while (t.hasMoreTokens() && x != -1) {
						x = Value(t.nextToken());
						if (x == -1)
							v = -1;
						else
							v += x;
					}
					if (value[i][j] != v) {
						change = true;
						value[i][j] = v;
					}
				}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++)
				if (value[i][j] == -1)
					System.out.print("* ");
				else
					System.out.print(value[i][j] + " ");
			System.out.println();
		}

	}

	public static int Value(String s) {
		int v;
		if (s.charAt(0) >= 'A' && s.charAt(0) <= 'J')
			v = value[s.charAt(0) - 'A'][s.charAt(1) - '1'];
		else
			v = Integer.parseInt(s);
		return v;
	}
}