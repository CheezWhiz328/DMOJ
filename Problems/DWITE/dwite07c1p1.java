import java.io.*;
import java.util.*;

public class dwite07c1p1 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int count=0;

		for(int i = 2; i<=C/2; i++){
			if(C%i==0){
				count++;
			}
		}
		if(count==0&&C>1){
			System.out.println("prime");
		}else{
			System.out.println("not");
		}
    }
}