import java.util.Scanner;

public class RainbowRating {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			if(b<1000) {
				System.out.println("Newbie");
			}else if(b<1200) {
				System.out.println("Amateur");
			}else if(b<1500) {
				System.out.println("Expert");
			}else if(b<1800) {
				System.out.println("Candidate Master");
			}else if(b<2200) {
				System.out.println("Master");
			}else if(b<3000) {
				System.out.println("Grandmaster");
			}else if(b<4000) {
				System.out.println("Target");
			}else {
				System.out.println("Rainbow Master");
			}
		}
		
	}
}
