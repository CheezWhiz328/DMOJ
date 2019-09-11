import java.util.Scanner;

public class ccc10j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
	
		int Ncount = 0;
		int Ndir = 1;
		int Bcount = 0;
		int Bdir = 1;
		int countN = 0;
		int countB = 0;
		
		for(int i=0; i<s; i++) {
			countN++;
			if(countN==a && Ndir == 1) {
				countN = 0;
				Ndir = -1;
			}

			else if(countN==b && Ndir == -1) {
				countN = 0;
				Ndir = 1;
			}
			Ncount += Ndir;
			
			countB++;
			if(countB==c && Bdir == 1) {
				countB = 0;
				Bdir = -1;
			}

			else if(countB==d && Bdir == -1) {
				countB = 0;
				Bdir = 1;
			}
			Bcount += Bdir;
		}
		
//		System.out.println(Ncount+" "+Bcount);
		
		if(Ncount>Bcount) {
			System.out.println("Nikky");
		}else if(Bcount>Ncount) {
			System.out.println("Byron");
		}else {
			System.out.println("Tied");
		}
	}
}
