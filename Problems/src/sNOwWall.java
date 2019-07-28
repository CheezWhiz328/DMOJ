import java.util.Scanner;

public class sNOwWall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		boolean[] a = new boolean[100005];
		for(int i=0; i<N; i++) {
			a[i] = !a[i];
		}
		
		for(int i=0; i<Q; i++) {
			int T = sc.nextInt();
			if(T==0) {
				int L = sc.nextInt();
				int R = sc.nextInt();
			}
			
			if(T==1) {
				int L = sc.nextInt();
				int R = sc.nextInt();
			}
			
			if(T==2) {
				
			}
		}
	}
}
