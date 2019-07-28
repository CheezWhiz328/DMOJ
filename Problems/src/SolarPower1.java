import java.util.Scanner;

public class SolarPower1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int sum = N*T;
		for(int i=0;  i<N-T; i+=T) {
			System.out.println("hi");
			sum += (T*(T-1))/2;
		}
		sum += (N-T) * -T;
		System.out.println(sum);
	}
}
