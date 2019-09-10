import java.util.Arrays;
import java.util.Scanner;

public class coci06c2p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] h = new int[3];
		for(int i=0; i<3; i++){
			h[i] = sc.nextInt();
		}		
		Arrays.sort(h);		
		String hi = sc.next();
		if(hi.equals("ABC")){
			System.out.println(h[0]+" "+h[1]+" "+h[2]);
		}else if(hi.equals("ACB")){
			System.out.println(h[0]+" "+h[2]+" "+h[1]);
		}else if(hi.equals("BAC")){
			System.out.println(h[1]+" "+h[0]+" "+h[2]);
		}else if(hi.equals("BCA")){
			System.out.println(h[1]+" "+h[2]+" "+h[0]);
		}else if(hi.equals("CAB")){
			System.out.println(h[2]+" "+h[0]+" "+h[1]);
		}else {
			System.out.println(h[2]+" "+h[1]+" "+h[0]);
		}
	}
}