import java.util.Arrays;
import java.util.Scanner;

public class MedianMark {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double[] b = new double[a];
		for(int i=0; i<a; i++) {
			b[i] = sc.nextDouble();
		}
		Arrays.sort(b);
		if(a%2==1) {
			System.out.println((int)b[a/2]);
		}else {
			System.out.println(Math.round((b[a/2-1]+b[a/2])/2));
		}
		
		
	}
}
