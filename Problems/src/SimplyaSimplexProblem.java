import java.util.Scanner;

public class SimplyaSimplexProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			int M = sc.nextInt();
			int count = 0;
			while(true) {
				count ++;
				if(count*(count+1)/2 >=M) {
					System.out.print(count+"\n");
					break;
				}
			}
			
		}
	}
}
