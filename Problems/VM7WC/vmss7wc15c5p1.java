import java.util.Scanner;

public class vmss7wc15c5p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String s = sc.next();
		if(s.contains("t")) {
			flag = true;
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextDouble();
		if(!flag) {
			c=0;
		}
		for(int i=0; i<3; i++) {
			c+= sc.nextDouble()/sc.nextDouble()*sc.nextDouble();
		}
		
		System.out.println(Math.round(c*100));
		
	}
}