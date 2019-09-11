import java.util.Scanner;

public class ccc03j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int s = sc.nextInt();
		int h = sc.nextInt();
		for(int i=0; i<t; i++){
			System.out.print("*");
			for(int j=0; j<2; j++){
				for(int k=0; k<s; k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		int c = s*2+3;
		
		for(int i=0; i<c; i++){
			System.out.print("*");
		}
		System.out.println();
		
		
		for(int i=0; i<h; i++){
			for(int j=0; j<s+1; j++){
			System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
