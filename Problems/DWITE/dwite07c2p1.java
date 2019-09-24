import java.util.Scanner;

public class dwite07c2p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			int count = 0;
			for(int j=2; j<=Math.sqrt(a); j++) {
				if(a%j==0) {
					if(a%(j*j*j)==0){
						count = 999;
					}
					count++;
				}
			}if(count==1) {
				System.out.println("semiprime");
			}else {
				System.out.println("not");
			}
		}

	}
}