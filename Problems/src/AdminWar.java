import java.util.Scanner;

public class AdminWar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[][] b = new int[a][2];
		for(int i=0; i<2; i++) {
			for(int j=0; j<a; j++) {
				b[j][i] = sc.nextInt();
			}
		}
		
		int xc = 0;
		int fc = 0;
		for(int i=0; i<a; i++) {
			if(b[i][0]>b[i][1]) {
				xc++;
			}if(b[i][0]<b[i][1]) {
				fc++;
			}
		}System.out.println(xc+" "+fc);
		if(xc>fc) {
			System.out.println("Xyene");
		}else if(xc<fc) {
			System.out.println("FatalEagle");
		}else {
			System.out.println("Tie");
		}

	}
}
