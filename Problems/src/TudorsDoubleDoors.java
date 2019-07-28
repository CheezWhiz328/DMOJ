import java.math.BigInteger;
import java.util.Scanner;

public class TudorsDoubleDoors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = BigInteger.valueOf(sc.nextLong());
		BigInteger b = BigInteger.valueOf(sc.nextLong());
		if((a.multiply(b)).mod(BigInteger.valueOf(2))==BigInteger.ONE) {
			System.out.println(a.multiply(b).divide(BigInteger.valueOf(2))+".5");
		}else
			System.out.println(a.multiply(b).divide(BigInteger.valueOf(2))+".0");
	}
}
