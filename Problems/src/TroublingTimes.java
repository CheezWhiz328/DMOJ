import java.util.Arrays;
import java.util.Scanner;

public class TroublingTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int j = 0;
		int[] a = new int[N];
		for(int i = 0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i<N; i++) {
			if(M%a[i]==0) {
				j = M/a[i];
			}
		}
		if(j==0) {
			System.out.println("This is not the best time for a trip.");
		}else {
			System.out.println(Math.abs(j));
		}
	}
}
