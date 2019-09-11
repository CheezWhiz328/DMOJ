import java.util.Scanner;

public class ccc17j3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int battery = sc.nextInt();
	
		int moving = Math.abs(a-c) + Math.abs(b-d);
		
		
		if(battery >= moving && (battery -moving) %2 == 0){
			System.out.println("Y");
		}
		
		else {
			System.out.println("N");
		
		}
		
	}

}