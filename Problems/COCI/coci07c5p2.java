import java.util.Scanner;

public class coci07c5p2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if(N%2==0) {
			System.out.println(N/2);
			System.exit(0);
		}else {
			int a = N/3;
			if(a%2==0) {
				a++;
			}
			for(int i=a; i>=1; i-=2) {
				if(N%i==0) {
					System.out.println(N-i);
					break;
				}
			}
		}
		
		
	}
}