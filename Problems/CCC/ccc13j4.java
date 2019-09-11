import java.util.Arrays;
import java.util.Scanner;

public class ccc13j4 {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		
		int Min = sc.nextInt();
		int numChores = sc.nextInt();
		int[] chores = new int[numChores];
		int total = 0;
		int count = 0;
		
		for(int i = 0; i<numChores;i++)		
			chores[i] = sc.nextInt();
			
		Arrays.sort(chores);
		
		for(int i=0; i<numChores;i++){
			total += chores[i];
			if(total<=Min){			
				count++;
			}else{
				break;
			}
		}
		System.out.println(count);
	}
}