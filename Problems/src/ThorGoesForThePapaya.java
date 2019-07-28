import java.util.Scanner;

public class ThorGoesForThePapaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++) {
        	b[i] = sc.nextInt();
        }
        String S ="";
        for(int i=0; i<a-1; i++) {
        	char product = (char) ((b[i]*b[i+1]) % 26 + 65);
        	S += product;
        }System.out.println("Thanos is on Planet: " +S);
    }
}
