import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long str = sc.nextLong();
		long a = 0;
		long b = 1;
		long res = 0;
		if(str==0) {
			System.out.print(0);
			System.exit(0);
		}if(str==1) {
			System.out.println(1);
		}
		for(long i=1; i<str; i++) {
			res =a+b;
			a=b;
			b=res;
			System.out.print(res+" ");
			System.out.print((long)(res%(Math.pow(10, 9)+7)));
			System.out.println();
		}System.out.println((long)(res%(Math.pow(10, 9)+7)));
	}
}
