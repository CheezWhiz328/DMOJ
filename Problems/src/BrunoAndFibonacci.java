import java.util.Scanner;

public class BrunoAndFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int a = 0, b = 1, c;
		int e=0;
		while(b<=n){
			c = a + b;
			a = b;
			e = b;
			b = c;
			if(b>n) {
				b-=c-a;
				break;
			}
			if(s.charAt(e-1)!='A') {
				System.out.println("Bruno, GO TO SLEEP");
				System.exit(0);
			}
			for(int i=e+1; i<b; i++) {
				if(s.charAt(i-1)=='A') {
					System.out.println("Bruno, GO TO SLEEP");
					System.exit(0);
				}
			}
		}
		for(int i=b; i<s.length(); i++) {
			if(s.charAt(i)=='A') {
				System.out.println("Bruno, GO TO SLEEP");
				System.exit(0);
			}
		}
		System.out.println("That's quite the observation!");

	}
}
