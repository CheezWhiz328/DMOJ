import java.util.Arrays;
import java.util.Scanner;

public class ccc18s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] a = new double[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextDouble();
		}
		
		Arrays.sort(a);
		double minVal = Double.MAX_VALUE;
		for(int i=1; i<N-1; i++) {
			if((a[i]-a[i-1])/2+(a[i+1]-a[i])/2<minVal) {
				minVal=(a[i]-a[i-1])/2+(a[i+1]-a[i])/2;
			}
		}
		
		System.out.printf("%.1f", minVal);
	}
}