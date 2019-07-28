import java.util.Scanner;

public class Dodgeball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		int count=1, increment = 0;
		for(int i=1; i<a; i++) {
			increment++;
			String c = sc.next();
			
			if(b.charAt(0)==c.charAt(0)) {
				if(i==1) {
					count++;
				}
			}else {
				increment=1;		
			}
			b=c;
			count+=increment;
//			System.out.println(count);
		}System.out.println(count);
	}
}
