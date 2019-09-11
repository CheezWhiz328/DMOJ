import java.io.*;
import java.util.*;

public class ccc05j2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int factor=0;
		int count = 0;
		int c = sc.nextInt();
		int a = sc.nextInt();
		for(int b = c; b<=a; b++){
			for(int i=1; i<=b; i++){
				if(b%i==0){
					factor++;
				}
			}
			
			if(factor==4){
				count++;
				factor=0;
			}else{
				factor=0;
			}
		}
		
		System.out.println("The number of RSA numbers between "+c+" and "+a+" is "+count);
    }
}