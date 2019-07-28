import java.util.Scanner;

public class CarolsCuteCacti {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (a+b)/2;
		int c1=c;
		int c2=c;
		while(true) {
			c1++;
			c2--;
			boolean palindronec1 = true;
			String d = Integer.toString(c1);
			for(int i=0; i<d.length(); i++) {
				if(d.charAt(i)!=d.charAt(d.length()-i-1)) {
					palindronec1 = false;
					break;
				}
			}
			if(palindronec1) {
				System.out.println(c1);
				break;
			}
			
			boolean palindronec2 = true;
			String e = Integer.toString(c2);
			for(int i=0; i<e.length(); i++) {
				if(e.charAt(i)!=e.charAt(e.length()-i-1)) {
					palindronec2 = false;
					break;
				}
			}
			
			if(palindronec2) {
				System.out.println(c2);
				break;
			}
			
		}
		
		
	}
}
