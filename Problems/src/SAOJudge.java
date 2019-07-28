import java.util.Scanner;

public class SAOJudge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long count = 0;
		for(long i=1; i<=N; i++) {
			long power = 1;
			for(long j=0; j<6; j++) {
				power *= i % 1000000000;
			}
			count += power;
			count %= 1000000000;
		}
		System.out.print(count);
				
	}
}
