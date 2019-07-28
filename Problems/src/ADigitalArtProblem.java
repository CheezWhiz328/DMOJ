import java.util.Scanner;

public class ADigitalArtProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Double[] a = new Double[6];
		for(int i=0; i<6; i++) {
			a[i] = sc.nextDouble();
		}
		
		if(s.contains("M")) {
			System.out.println(a[0]*a[3]+" "+ a[1]*a[4] +" "+ a[2]*a[5]);
		}if(s.contains("S")) {
			System.out.println(Double.toString(1-(1-a[0])*(1-a[3]))+" "+Double.toString(1-(1-a[1])*(1-a[4]))+" "+Double.toString(1-(1-a[2])*(1-a[5])));
		}if(s.contains("O")) {
			for(int i=0; i<3; i++) {
				if(a[i]<0.5) {
					System.out.print(2*(a[i]*a[i+3])+" ");
				}else {
					System.out.print(1-2*(1-a[i])*(1-a[i+3])+" ");
				}
			}
		}
	}
}
