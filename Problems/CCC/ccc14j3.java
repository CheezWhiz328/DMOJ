import java.util.Scanner;

public class ccc14j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int xCount = 100;
		int yCount = 100;
		for(int i=0; i<a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x<y) {
				xCount-=y;
			}if(y<x) {
				yCount-=x;
			}
		}
		
		System.out.println(xCount);
		System.out.println(yCount);
	
	
	}	
}