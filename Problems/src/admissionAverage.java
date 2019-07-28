import java.util.Scanner;

public class admissionAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double count = 0;
		for(int i=0; i<6; i++) {
			count+= sc.nextDouble();
		}
		count /=6;
		count += sc.nextDouble();
		int hi = sc.nextInt();
		if(count>=hi) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
