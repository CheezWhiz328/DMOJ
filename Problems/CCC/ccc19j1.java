import java.util.Scanner;

public class ccc19j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acount = 0;
		int bcount = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		acount = a*3 + b*2 + c;
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		bcount = a1*3 + b1*2 +c1;
		
		if(acount>bcount) {
			System.out.println("A");
		}else if(acount<bcount) {
			System.out.println("B");
		}else {
			System.out.println("T");
		}

	}
}