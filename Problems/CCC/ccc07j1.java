import java.util.Arrays;
import java.util.Scanner;

public class ccc07j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] yo = new int[3];
		
		for(int i=0; i<3; i++){
			yo[i] = sc.nextInt();
		}
		
		Arrays.sort(yo);
		
		System.out.println(yo[1]);
	}
}