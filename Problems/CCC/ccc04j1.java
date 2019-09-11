import java.util.Scanner;

public class ccc04j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double M = Math.sqrt(N);
		double hi = Math.floor(M);
		
		System.out.print("The largest square has side length ");
		System.out.printf("%.0f", hi);
		System.out.print(".");
		
	}
}