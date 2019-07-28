import java.util.Scanner;

public class GrumpyDwarf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		
		int t = 0,s = 0;
		while(a >= 1) {
			t += a;
			s+=a;
			a = s/b;	
			s%=b;
		}
		
		System.out.println(t);
	}
}