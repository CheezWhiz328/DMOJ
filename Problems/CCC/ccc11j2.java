import java.io.*;
import java.util.*;

public class ccc11j2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Hd = sc.nextInt();
		int Hr = sc.nextInt();
		
		for(int i=1; i<=Hr+1; i++){
			
			if((-6*i*i*i*i)+(Hd*i*i*i)+(2*i*i)+(i)<=0){
				System.out.println("The balloon first touches ground at hour:");
				System.out.println(i);
				break;
			}
			
			if(i>Hr){
				System.out.println("The balloon does not touch ground in the given time.");
			}
		}
    }
}