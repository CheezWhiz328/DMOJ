import java.io.*;
import java.math.BigInteger;

public class JasonsTheorem {
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(sc.readLine());
		System.out.println(new BigInteger("2").modPow(N.add(new BigInteger("3")), new BigInteger("1000000007"))
				.subtract(new BigInteger("5")));
	}
}