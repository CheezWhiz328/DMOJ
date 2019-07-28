import java.util.Scanner;

public class DiscerningDiscounts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i=0; i<a; i++) {
			double c = sc.nextInt();
			double d = sc.nextInt();
			if(c*(1-d/100)<=b) {
				count++;
			}
		}System.out.println(count);
	}
}
