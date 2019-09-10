import java.util.Arrays;
import java.util.Scanner;

public class coci08c2p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0; i<4; i++) {
        	a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0]*a[2]);
        
    }
}