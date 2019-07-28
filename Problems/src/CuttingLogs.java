import java.util.Scanner;

public class CuttingLogs {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String s = sc.next();
		while(s.charAt(s.length()-1)=='X' ) {
			s = s.substring(0, s.length()-1);
			if(s.length()==0) {
				System.out.println(0);
				System.exit(0);
			}
		}while(s.charAt(0)=='X') {
			s = s.substring(1, s.length());
		}

		int count = 0;
		for(int i=1; i<s.length()-1; i++) {
			if(s.charAt(i)=='X' &&s.charAt(i-1)=='O') {
				count++;
			}
		}
		System.out.println(count+1);
		count=0;
		for(int i=0; i<s.length(); i++) {
			count++;
			if(s.charAt(i)=='X') {
				for(int j=0; j<count-1; j++) {
					System.out.print("O");
				}System.out.println();
				count=0;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.print("O");
		}
		
	}
}
