import java.util.Scanner;

public class ccc11j3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 2;
		
		while(true){
			
			if(a<b){
				break;
			}
			int c = a;
			a = b;
			b = c-a;
			count++;
		}
		System.out.println(count);
		
	}
}