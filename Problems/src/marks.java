import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double avg = 0;
		for(int i =0; i<4; i++) {
			System.out.println("Enter the "+ (i+1) + " mark:");
			avg += sc.nextDouble();
		}System.out.print("avg = ");
		System.out.printf("%.2f", avg/4);
	}

}
