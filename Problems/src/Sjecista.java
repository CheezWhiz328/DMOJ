import java.util.Scanner;

public class Sjecista {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		System.out.println(((a - 3) * (a - 2) * (a -1) * a) / 24);
	}
}
