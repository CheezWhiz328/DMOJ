import java.util.Scanner;

public class vmss7wc16c4p1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<0) {
			a=0;
		}
		int c = (int) Math.ceil(Math.sqrt(a));
		int count=0;
		while(c*c<=b) {
			count++;
			c++;
		}
		
		System.out.println(count);
	}
}