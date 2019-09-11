import java.util.*;

public class ccc08s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			
			if (a == 0) {
				System.exit(0);
			}
			
			int pennies = 0;	
			
			for (int i = 0; i < a; i++) {
				pennies += (int) Math.sqrt(a*a - i*i);
			}
			pennies *= 4;
			pennies++;
			System.out.println(pennies);

		}
	}
}