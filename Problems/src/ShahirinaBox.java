import java.util.Scanner;

public class ShahirinaBox {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int x = -1;
		int y = -1;
		int minx = 99999999;
		int miny = 99999999;
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			if(b<minx) {
				minx=b;
			}
			if(b>x) {
				x=b;
			}int c = sc.nextInt();
			if(c<miny) {
				miny=c;
			}
			if(c>y) {
				y=c;
			}
		}System.out.println((x-minx)*(y-miny));
		
	}
}
