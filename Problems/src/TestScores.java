import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c = new int[a];
		for(int i=0; i<a; i++) {
			c[i]=sc.nextInt();
			if(c[i]<0) {
				c[i] = 0;
			}
		}
		
		Arrays.sort(c);
		int count =0;
		for(int i=a-1; i>=a-b; i--) {
			count+=c[i];
		}System.out.println(count);
		
	}
}
