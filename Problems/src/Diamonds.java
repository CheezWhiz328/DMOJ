import java.util.Scanner;

public class Diamonds {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0; i<a/2+1; i++) {
			for(int j=0; j<a/2+1-i; j++) {
				System.out.print("*");
			}for(int j=0; j<i*2-1; j++) {
				System.out.print(" ");
			}for(int j=0; j<a/2+1-i; j++) {
				if(j==0 && i==0) {
					j++;
				}
				System.out.print("*");
			}
			System.out.println();
		}for(int i=a/2-1; i>=0; i--) {
			for(int j=0; j<a/2+1-i; j++) {
				System.out.print("*");
			}for(int j=0; j<i*2-1; j++) {
				System.out.print(" ");
			}for(int j=0; j<a/2+1-i; j++) {
				if(j==0 && i==0) {
					j++;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
