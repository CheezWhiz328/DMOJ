import java.util.Scanner;

public class countShapes {
//4 10 6 5 15
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean [][] c = new boolean[a+2][b+2];
			for(int j=0; j<b; j++) {
				String s = sc.next();
				for(int k=0; k<a; k++) {
					if(s.charAt(k)=='X') {
						c[k+1][j+1] = true;
					}
				}
			}
			
			int count = 0;
			boolean shape = false;
			for(int j=1; j<=b; j++) {
				for(int k=1; k<=a; k++) {
					if(c[k][j]) {
						count++;
					}
				}
			}
			
		}
		
		
		
	}
}
