import java.util.Scanner;

public class ccc08j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		if(bmi>25){
			System.out.println("Overweight");
		}else if(bmi>=18.5&&bmi<25){
			System.out.println("Normal weight");
		}else{
			System.out.println("Underweight");
		}
	}
}