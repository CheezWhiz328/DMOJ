import java.util.*;

public class dwite10c4p2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] prime = new int[7919];
		prime[0] = 2;
		int count = 1;
		for(int i=3; i<95420; i++) {
			boolean p = true;
			if(i%2==0) {
				p = false;
			}else {
				for(int j=3; j*j<=i; j+=2) {
					if(i%j==0) {
						p = false;
						break;
					}
				}
			}
			
			if(p) {
				prime[count] = i;
				count++;
				if(i==80917) {
					break;
				}
			}
		}
		for(int i=0; i<5; i++) {
			int b = sc.nextInt();
			int c = prime[b-1];
			System.out.println(prime[c-1]);
		}
	}
}
