import java.util.Scanner;

public class BigChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				if((i+j)%2==0) {
					System.out.print(0);
				}else {
					System.out.print(1);
				}
			}System.out.println();
		}
	}

}
