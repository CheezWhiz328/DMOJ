import java.util.Scanner;

public class MagicalFunctions {
	static long a,b,c,d,N;
	public static long func(long hi) {
		return a*func(Math.floorDiv(N, b))+c*func(Math.floorDiv(N, d));
	}
	public static long funct(long a1, long b1, long c1, long d1, long e1, long N1) {

		if(N1==0) {
			return e1;
		}else {
			a=a1;
			b=b1;
			c=c1;
			d=d1;
			N=N1;
			return func(N);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		long N = sc.nextLong();
		System.out.println(funct(a,b,c,d,e,N));
	
	}
}
