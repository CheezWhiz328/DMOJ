import java.math.BigInteger;
import java.util.Scanner;

public class SAOJudgeTwo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = BigInteger.valueOf(sc.nextInt());
		System.out.println(((N.multiply(N)).add(N)).divide(BigInteger.valueOf(2)));
		
	}
}