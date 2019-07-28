import java.util.Scanner;

public class Pink {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int Pcount = 0;
		for(int i=0; i<a; i++) {
			int R = sc.nextInt();
			int G = sc.nextInt();
			int B = sc.nextInt();
			if(R>=240&R<=255&G>=0&G<=200&B>=95&B<=220) {
				Pcount++;
			}
		}System.out.println(Pcount);
		
	}
}
