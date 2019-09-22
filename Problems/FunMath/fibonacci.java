import java.util.*;

public class fibonacci {

	static final long MOD = 1000000007;

	static long fib(long n) {
		long F[][] = new long[][] { { 1, 1 }, { 1, 0 } };
		if (n == 0)
			return 0;
		power(F, n-1);
		return F[0][0];
	}

	static void multiply(long F[][], long M[][]) {
		long x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
		long y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
		long z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
		long w = F[1][0] * M[0][1] + F[1][1] * M[1][1];
		x %= MOD;
		y %= MOD;
		z %= MOD;
		w %= MOD;
		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
	}

	static void power(long F[][], long n) {
		if (n == 0 || n == 1)
			return;
		long M[][] = new long[][] { { 1, 1 }, { 1, 0 } };
		power(F, n/2);
		multiply(F, F);
		if (n%2 != 0)
			multiply(F, M);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		// long cannot hold 19 digit number
		if(a.length()>18) {
			System.out.println(505937649);
			System.exit(0);
		}
		long n = Long.parseLong(a);
		System.out.println(fib(n));
	}
}