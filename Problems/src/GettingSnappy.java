import java.util.Scanner;

public class GettingSnappy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a>=b*2) {
			a/=2;
		}
		
		int c = a/2;
		
		if(b-c<a-b) {
			a = c;
		}
		
		System.out.println(a);
	}
}