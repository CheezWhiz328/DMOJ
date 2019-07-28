import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Luggage {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = in.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int[] c = new int[a];
		String[] tmp1 = in.readLine().split(" ");
		for(int i=0; i<a; i++) {	
			c[i] = Integer.parseInt(tmp1[i]);
		}
		
		Arrays.sort(c);
		int count = 0;
		int dif = b;
		int mxcnt = count;
		int min = c[0];
		for(int i=1; i<a; i++) {
			if(c[i]-min<=dif) {
				count++;
				min = c[i-1];
				dif-= c[i]-min;
				if(count>mxcnt) {
					mxcnt=count;
				}
//				System.out.println(i+1);
//				System.out.println(c[i]+" "+dif+" "+mxcnt+" "+min);
			}else {
				if(mxcnt>=b+1) {
					System.out.println(b+1);
					System.exit(0);
				}
				dif = b;
				i-=count;
				count=0;
				
			}
			
			min = c[i];
			
			
		}
		
		System.out.println(mxcnt+1);
	}
}
