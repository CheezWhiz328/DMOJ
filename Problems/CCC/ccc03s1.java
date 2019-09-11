import java.util.Scanner;

public class ccc03s1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		while(true){
			int roll = sc.nextInt();
			if(roll==0){
				System.out.println("You Quit!");
				break;
			}
			
			count= count+roll;
				
			if(count==54){
				count=19;
			}else if(count==90){
				count=48;
			}else if(count==99){
				count=77;
			}else if(count==9){
				count=34;
			}else if(count==40){
				count=64;
			}else if(count==67){
				count=86;
			}else if(count==67){
				count=86;	
			}else if(count>100){
				count=count-roll;
			}else if(count==100){
				System.out.println("You are now on square "+count);
				System.out.println("You Win!");
				break;
			}		
			System.out.println("You are now on square "+count);
			
		}

	}
}