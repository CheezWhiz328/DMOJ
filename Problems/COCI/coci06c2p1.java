import java.util.Scanner;

public class coci06c2p1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b){
			System.out.println(b-(a-b));
		}else if(a==b){
			System.out.println(a);
		}else{
			System.out.println(b+(b-a));
		}
		
		
		
	}
}