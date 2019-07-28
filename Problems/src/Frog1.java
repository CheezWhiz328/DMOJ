import java.util.Scanner;
 
public class Frog1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
 
        int[] min = new int[n];
        min[0] = 0;
        for (int i = 1; i < n; i++) {
        	min[i] = min[i - 1] + Math.abs(h[i] - h[i - 1]);
 
            if (i  >= 2)
                min[i] = Math.min(min[i], min[i - 2] + Math.abs(h[i] - h[i - 2]));
        }
 
        System.out.println(min[n - 1]);
    }
 
}