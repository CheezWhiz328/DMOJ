import java.util.Scanner;

public class ccc96s1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count=0;
		
		for(int i=0; i<a; i++){
			int yo = sc.nextInt();
			for(int j=1; j<yo; j++){
				if(yo%j==0){
					count=count+j;
				}
			}
			
			if(count==yo){
				System.out.println(yo+" is a perfect number.");
			}else if(count>yo){
				System.out.println(yo+" is an abundant number.");
			}else{
				System.out.println(yo+" is a deficient number.");
			}
			count=0;
		}
		
	}
}