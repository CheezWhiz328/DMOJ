import java.util.Scanner;

public class ccc19j2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a];
		String[] S = new String[a];
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
			S[i] = sc.next();
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b[i]; j++) {
				System.out.print(S[i]);
			}
			System.out.println();
		}
		
	}
}