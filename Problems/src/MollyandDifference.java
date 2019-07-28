import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MollyandDifference {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); 
		int[] b = new int[a];
		String S = br.readLine();
	    String[] strs = S.trim().split("\\s+");

	    for (int i = 0; i < strs.length; i++) {
	    b[i] = Integer.parseInt(strs[i]);
	    }
		Arrays.sort(b);
		int diff = Integer.MAX_VALUE;
		for(int i = 0 ; i<a-1; i++) {
			if(b[i+1]-b[i]<diff) {
				diff = b[i+1]-b[i];
				if(diff==0) {
					System.out.println(0);
					System.exit(0);
				}
			}
		}
		
		System.out.println(diff);
		
	}
}
