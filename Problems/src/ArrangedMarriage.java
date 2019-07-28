import java.util.Scanner;

public class ArrangedMarriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        10000000000 1 100
//        9223372036854775807
        double N = sc.nextDouble();
        double B = sc.nextDouble();
        double A = sc.nextDouble();
        double x = Math.ceil((B*N-A)/(B*2));
        if(x>N) {
        	x=N;
        }

        System.out.println((long)(((long)(A)+(long)(B)*(long)(x))*(long)(x)));
//        for(int i=0; i<N; i++) {
//        	System.out.print((A+B*(N-i))*i);
//        	System.out.print(" "+(A+B*(N-(i-1)))*(i-1));
//        	System.out.print(" "+((A+B*(N-i))*i-(A+B*(N-(i-1)))*(i-1)));
//        	System.out.print(" "+((B*N+A)*i-B*i*i));
//        	System.out.println();
//        }
    }
}
