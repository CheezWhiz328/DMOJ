import java.util.Scanner;

public class GermanNouns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < a; i++) {
			String str = sc.nextLine();
			String[] hi = str.split(" ");
			int count=0;
			for(int j=0; j<hi.length; j++) {
				if(hi[j].charAt(0)<=90) {
					count++;
				}
			}
			System.out.println(count);
			
		}
	}
}