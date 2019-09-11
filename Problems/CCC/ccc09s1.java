import java.io.*;
import java.util.*;

public class ccc09s1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		int i = 1;
		while(true){
			
			
			if(Math.pow(i,6)>=a){
				break;
			}i++;
		}
		
		while(true){

			if(Math.pow(i,6)>=a&&Math.pow(i,6)<=b){
				count++;
			}else{
				System.out.println(count);
				break;
			}
			i++;
		}
    }
}