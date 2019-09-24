import java.util.Arrays;
import java.util.Scanner;

public class dwite08c2p2 {
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			char[] a = sc.next().toCharArray();
			Arrays.sort(a);
			System.out.println(a[a.length-1]);
		}
		
	}
}