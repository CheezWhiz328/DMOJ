import java.util.Scanner;

public class ccc01j1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<N; i=i+2){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			for(int j=0; j<2*N-2*i; j++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=N; i>0; i=i-2){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			for(int j=0; j<2*N-2*i; j++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
