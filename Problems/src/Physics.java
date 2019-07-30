import java.util.Scanner;

public class Physics {
	static long rnd(double n) {
		if (n - Math.floor(n) == 0.5) {
			long a = (long) Math.floor(n);
			return a % 2 == 0 ? a : a++;
		}
		return (long) n;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		long count = 0;
		double counta = 0;
		long count1 = 0;
		double counta1 = 0;

		for (int i = 0; i < a; i++) {
			long b = sc.nextLong();
			if(b%2==0) {
				counta -= 0.5;
				counta1 += 0.5;
			}else {
				counta -= 0.5 + 5E-6;
				counta1 += 0.5 - 5E-6;
			}
			
			count += b;
			count1 += b;
		}
		System.out.println(rnd((count+counta)));
		System.out.println(rnd(count1+counta1));

	}
}