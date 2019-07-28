import java.util.Scanner;

public class FizzFuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = 0;
		int b = -1;
		for(int i=0; i<c; i++) {
			a++;
			b+=2;
			if(a%7==0 && a%13==0) {
				System.out.print("Fizz Fuzz ");
			}else if(a%7==0) {
				System.out.print("Fizz ");
			}else if(a%13==0) {
				System.out.print("Fuzz ");
			}else {
				System.out.print(a+" ");
			}
			
			if(b%7==0 && b%13==0) {
				System.out.print("Fizz Fuzz");
			}else if(b%7==0) {
				System.out.print("Fizz");
			}else if(b%13==0) {
				System.out.print("Fuzz");
			}else {
				System.out.print( b);
			}
			System.out.println();
		}
	}

}
