// 8/10 IntegerOverflow :(
import java.util.Scanner;

public class JasonsTheorem {
	static long get_power(int X, long l, int M){
		long answer = 1;
		for (long base = X, group = 1; group <= l; group*=2, base = ((long)base*base) % M){
			if ((group & l) > 0){
				answer = (long) answer * (base) % M;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long a = get_power(2, n+3, 1000000007) - 5;
		System.out.println(a);
	}
}