import java.util.Scanner;

public class ArrangedMarriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long B = sc.nextLong();
		long A = sc.nextLong();
		if(B==0) {
			System.out.println(A*N);
			System.exit(0);
		}
		long x = (B * N + A) / (B * 2);
		long ans = (A + B * x) * (N - x);
		System.out.println(ans);

	}
}
