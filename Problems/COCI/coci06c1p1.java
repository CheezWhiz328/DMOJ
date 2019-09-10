import java.io.*;
import java.util.*;

public class coci06c1p1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int[] hi = new int[42];
		int count=0;
		
		for(int i=0; i<10; i++){
			int yo = sc.nextInt();
			int hey = yo%42;
			hi[hey]++;
			if(hi[hey]==1){
				count++;
			}
		}
		System.out.println(count);

    }
}