import java.io.*;
import java.util.*;

public class coci07c3p1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] h = new int[3];
		
		for(int i=0; i<3; i++){
			h[i] = sc.nextInt();
		}
		
		Arrays.sort(h);
		
		if(h[1]-h[0]==h[2]-h[1]){
			System.out.println((h[2]-h[1])+h[2]);
		}else if(h[1]-h[0]<h[2]-h[1]){
			System.out.println((h[1]-h[0])+h[1]);
		}else if(h[1]-h[0]>h[2]-h[1]){
			System.out.println(h[1]-(h[2]-h[1]));
		}
    }
}