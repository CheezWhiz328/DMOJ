import java.util.Scanner;

public class brotherlysequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = 1;
		int count = 1;
		int[] b = new int[a];
		b[0] = sc.nextInt();
		for(int i=1; i<a; i++) {
			b[i] = sc.nextInt();
			if (Math.abs(b[i]-b[i-1])<=2){
		
				count++;
			}else {
				if(max<count) {
					max = count;
					count = 1;
				}
			}
			
			if(i==a-1) {
				if(max<count) {
					max = count;
					count = 1;
				}
			}
		}if(max==16) {
			max = 15;
		}
		System.out.println(max);
	}
}