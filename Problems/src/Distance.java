import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        for(int i=0; i<a/2; i++) {
        	System.out.print(i+1+" ");
        	System.out.print((a-i)+" ");
        }
        if(a%2==1) {
        	System.out.print(a/2+1);
        }
    }
}
