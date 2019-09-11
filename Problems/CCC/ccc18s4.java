import java.util.Scanner;

public class ccc18s4 {
	
	static long f(int N) {
		int add = 0;
		if(N<=2) {
			return 1;
		}
		for(int i=2; i<=N; i++) {
			add += f(N/i);
		}
		return add;
		
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	
		System.out.println(f(a));
	}
}