import java.util.Scanner;

public class coci08c1p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int a1 = b-a;
		int b1 = c-b;
		if(a1>b1) {
			System.out.println(a1-1);
		}else {
			System.out.println(b1-1);
		}
	}
}