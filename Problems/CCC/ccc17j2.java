import java.util.Scanner;

public class ccc17j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int j = N;
		
		for(int i = 0; i<K; i++){
			
	
			N = N*10;
			j = N + j;	
			
		}
		
		System.out.println(j);
	}

}