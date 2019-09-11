import java.util.Scanner;

public class ccc04j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] A = new String[a];
		String[] B = new String[b];
		
		for(int i=0; i<a; i++){
			A[i] = sc.next();
		}
		
		for(int i=0; i<b; i++){
			B[i] = sc.next();
		}
		
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				System.out.println(A[i]+" as "+B[j]);
			}
		}
		
		
				
	}
}