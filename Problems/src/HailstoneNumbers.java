import java.util.Scanner;

public class HailstoneNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;;
		while(a!=1){
			count++;
			if(a%2==0) {
				a/=2;
			}else {
				a*=3;
				a++;
			}
		}
		System.out.println(count);
		
	}
}
