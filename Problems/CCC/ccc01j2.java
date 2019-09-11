import java.util.Scanner;

public class ccc01j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int m = sc.nextInt();
		int count=0;
		
		for(int i=0; i<m;i++){
			
			int n=i;
			if((x*n)%m==1){
				System.out.println(n);
				count++;
			}
		}
		
		if(count==0){
			System.out.println("No such integer exists.");
		}
		
	}
}
