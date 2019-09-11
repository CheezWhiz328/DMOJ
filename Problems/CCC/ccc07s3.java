import java.util.Scanner;

public class ccc07s3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		while(true) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(c==0 && d==0) {
				System.exit(0);
			}
			int e = c;
			int f = d;
			int steps = -1;
			while(e!=f && steps < 10000) {
				for(int i=0; i<n; i++) {
					if(a[i] == e) {
						e = b[i];
						steps++;
						break;
					}
				}
			}
			
			if(steps < 10000 - 1 ) {
				System.out.println("Yes "+ steps);
			}else {
				System.out.println("No");
			}
			
		}
	}
}
