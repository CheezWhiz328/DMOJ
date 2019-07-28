import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = 200;
		
		for(int i=0; i<a; i++) {
			b-=sc.nextInt();
		}
		if(b<0) {
			System.out.println("Over maximum capacity!");
		}else {
			System.out.println(b);
		}
	}

}
