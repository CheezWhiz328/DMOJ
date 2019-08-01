import java.util.*;
// will tle
public class FastFactorialCalculator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long mod = (1L << 32) - 5;
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			long c = Long.parseLong(b);
			if (c >= mod)
				System.out.println(0);
			else {
				long factorial = 1;
				
				for (int j = 1; j <= c; j++)
					factorial = (factorial * j) % mod;
				System.out.println(factorial);
			}
		}
	}

}