import java.util.Scanner;

public class SumofPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			int a = sc.nextInt();
			if(a==2) {
				System.out.println(2);
			}else {
				int count = 2;
				for(int j=3; j<=a; j+=2) {
					boolean prime = true;
					for(int k=3; k<=Math.sqrt(j); k++) {
						if(j%k==0) {
							prime = false;
							break;
						}
					}
					if(prime) {
						count+=j;
					}
				}
				System.out.println(count);
			}
		}
		
	}
}
