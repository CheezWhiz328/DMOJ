import java.util.Scanner;

public class vmss7wc15c2p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int count = 0;
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0; i<a-1; i++) {
			if(i==0) {
				if(b[i]<=41 && b[i+1]<=41) {
					count++;
				}
			}else {
				if(b[i-1]<=41 && b[i]<=41 && b[i+1]<=41) {
					count++;
				}
			}
		}
		if(count==3) {
			count++;
		}
		System.out.println(count);
	}
}