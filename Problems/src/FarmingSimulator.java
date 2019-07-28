import java.util.Arrays;
import java.util.Scanner;

public class FarmingSimulator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b = sc.nextInt();
		long[] farms = new long[a];
		for(int i=0; i<a; i++) {
			farms[i]=sc.nextInt();
		}
		Arrays.sort(farms);
		
		long count = 0;
		for(int i=a-1; i>=b; i--) {
			count+=farms[i];
		}
		System.out.println(count);
		
	}
}
