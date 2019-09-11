import java.util.Arrays;
import java.util.Scanner;

public class ccc13j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(true) {
			boolean  b = true;
			a++;
			if(a==2015) {
				System.exit(0);
			}
			String s = Integer.toString(a);
			int[] d = new int[s.length()];
			for(int i=0; i<s.length(); i++) {
				d[i] = Integer.valueOf(s.charAt(i)-48);
			}
			Arrays.sort(d);
			for(int i=0; i<d.length-1; i++) {
				if(d[i]==d[i+1]) {
					b = false;
					break;
				}
			}
			if(b) {
				System.out.println(a);
				break;
			}
		} 
	}

}