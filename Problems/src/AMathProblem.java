import java.util.*;

public class AMathProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double K = sc.nextDouble();
        double P = sc.nextDouble();
        double X = sc.nextDouble();
        
        double m = 1;
        while(true){
            if(function(K,P,X,m)<=function(K,P,X,m+1)){
                System.out.printf("%.3f\n", function(K,P,X,m));
                break;
            }
            m++;
        }

    }
    
    public static double function(double K, double P, double X, double m){
        return m*X+K*P/m;
    }
}