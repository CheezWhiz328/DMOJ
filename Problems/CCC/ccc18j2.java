import java.util.Scanner;

public class ccc18j2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		String A = sc.next();
		String B = sc.next();
		
		for(int i=0; i<N; i++){
			if(A.charAt(i)=='C'&&B.charAt(i)=='C'){
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}