import java.util.Scanner;

public class ccc09j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int hi = 91+a+c+(b*3);
		
		System.out.println("The 1-3-sum is "+hi);
		
	}
}