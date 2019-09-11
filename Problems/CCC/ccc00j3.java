import java.util.Scanner;

public class ccc00j3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		int quarters = sc.nextInt();
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		int count=0;
		
		while(true){
			
			count++;
			quarters--;
			if(quarters==0){
				System.out.println("Martha plays " +count+ " times before going broke.");
				break;
			}	
			first++;
			if(first==35){
				first = 0;
				quarters +=30;
			}
			
			count++;
			quarters--;
			if(quarters==0){
				System.out.println("Martha plays " +count+ " times before going broke.");
				break;
			}	
			second++;
			if(second==100){
				second = 0;
				quarters +=60;
			}
			
			count++;
			quarters--;
			if(quarters==0){
				System.out.println("Martha plays " +count+ " times before going broke.");
				break;
			}	
			third++;
			if(third==10){
				third = 0;
				quarters +=9;
			}
			
			
		}
	}

}
