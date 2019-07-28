import java.util.Scanner;

public class Sibice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c  = sc.nextInt();
		for(int i=0; i<a; i++) {
			int d = sc.nextInt();
			if(Math.sqrt(b*b+c*c)<d){
				System.out.println("NE");
			}else {
				System.out.println("DA");
			}
		}
	}
}
