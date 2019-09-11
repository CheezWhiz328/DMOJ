import java.util.Scanner;

public class ccc12j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int limit = sc.nextInt();
		int speed = sc.nextInt();
		
		while(true){
			if(speed>=limit+31){
				System.out.println("You are speeding and your fine is $500.");
				break;
			}
			
			else if(speed>=limit+21){
				System.out.println("You are speeding and your fine is $270.");
				break;
			}
			
			else if(speed>limit){
				System.out.println("You are speeding and your fine is $100.");
				break;
			} else{
				System.out.println("Congratulations, you are within the speed limit!");
				break;
			}
			
		}
	}
}