import java.util.*;

public class FastFactorialCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			if (b.length() > 2)
				System.out.println(0);
			else {
				long factorial = 1;
				long c = Long.parseLong(b);
				for (int j = 1; j <= c; j++)
					factorial = (factorial * j) % (1l << 32);
				System.out.println(factorial);
			}
		}
	}

}