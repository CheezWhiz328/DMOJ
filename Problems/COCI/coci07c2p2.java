import java.io.*;
import java.util.*;

public class coci07c2p2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count =1;
		int count1=2;

		for(int i=1; i<N; i=i+2){
			count++;
		}
		
		for(int i=2; i<N; i=i+2){
			count1++;

		}
		

		System.out.println(count*count1);
    }
}