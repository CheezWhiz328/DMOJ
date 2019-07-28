import java.util.Scanner;

public class JasonsTheorem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long a = (long) (((long) Math.pow(2, n+3)-5)%(Math.pow(10, 9)+7));
		System.out.println(a);
	}
}
