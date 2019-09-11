import java.util.Scanner;

public class ccc17s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] a1 = new int[a];
		int[] a2 = new int[a];
		for(int i=0; i<a; i++) 
			a1[i] = sc.nextInt();
		for(int i=0; i<a; i++) 
			a2[i] = sc.nextInt();
		
		int a1count = 0;
		int a2count = 0;
		for(int i=0; i<a; i++) {
			a1count+=a1[i];
			a2count+=a2[i];
		}
		
		if(a1count==a2count) {
			System.out.println(a);
			System.exit(0);
		}
		
		for(int i=a-1; i>=0; i--) {
			a1count-=a1[i];
			a2count-=a2[i];
			if(a1count==a2count) {
				System.out.println(i);
				System.exit(0);
			}
		}
		
	}
}