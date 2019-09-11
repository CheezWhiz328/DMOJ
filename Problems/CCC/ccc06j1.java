import java.util.Scanner;

public class ccc06j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int cal = 0;
		int Burger = sc.nextInt();
		if(Burger == 1){
			cal = cal+461;
		}
		
		else if(Burger == 2){
			cal = cal+431;
		}
		
		else if(Burger == 3){
			cal = cal+420;
		}
		
		else{
			
		}
		int Side = sc.nextInt();
		
		if(Side == 1){
			cal = cal+100;
		}
		
		else if(Side == 2){
			cal = cal+57;
		}
		
		else if(Side == 3){
			cal = cal+70;
		}
		
		else{
			
		}
		
		int Drink = sc.nextInt();
		
		if(Drink == 1){
			cal = cal+130;
		}
		
		else if(Drink == 2){
			cal = cal+160;
		}
		
		else if(Drink == 3){
			cal = cal+118;
		}
		
		else{
			
		}
		
		int Dessert = sc.nextInt();
		
		if(Dessert == 1){
			cal = cal+167;
		}
		
		else if(Dessert == 2){
			cal = cal+266;
		}
		
		else if(Dessert == 3){
			cal = cal+75;
		}
		
		else{
			
		}
		
		System.out.println("Your total Calorie count is " + cal+".");
	}
}
