import java.util.Scanner;
public class mwc15c8p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = (a*(a+1))/2;
		for(int i=0; i<a-1; i++) {
			n-=sc.nextInt();
		}System.out.println(n);
	}
}
