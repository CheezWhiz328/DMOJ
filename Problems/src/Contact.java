import java.util.Scanner;

public class Contact {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int a = sc.nextInt();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='S') {
				count++;
			}else {
				count = 0;
			}
			if(count>=a) {
				System.out.println("Spamming");
				System.exit(0);
			}
		}
		
		System.out.println("All good");
		
	}
}
