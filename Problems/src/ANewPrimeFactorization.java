import java.util.Arrays;
import java.util.Scanner;

public class ANewPrimeFactorization {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int[] fac = new int[40];
		int count = 0;
		int Fnum = 1;
		while (b % 2 == 0) {
			fac[count] = 2;
			count++;
			b = b / 2;
			Fnum = Fnum * 2;
		}
		for (int j = 2; j <= Math.sqrt(b); j++) {
			boolean flag = false;
			if (b % j == 0) {
				for (int k = 2; k <= Math.sqrt(j); k++) {
					if (j % k == 0) {
						flag = true;
					}
				}
				if (!flag) {
					fac[count] = j;
					count++;
					b = b / j;
					Fnum = Fnum * j;
					j = 2;
				}
			}
		}
		fac[count] = a / Fnum;
		Arrays.sort(fac);
		for(int i=0; i<fac.length; i++) {
			if(fac[i]!=0&&fac[i]!=1) {
				System.out.println(fac[i]);
			}
		}

	}
}
