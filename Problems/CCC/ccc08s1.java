import java.util.Scanner;

public class ccc08s1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a = "Waterloo";
    	int b = 42069;
    	while(true) {
    		String c = sc.next();
    		int d = sc.nextInt();
    		if(c.equals("Waterloo")) {
    			System.out.println(a);
    			System.exit(0);
    		}else {
    			if(d<b) {
    				a = c;
    				b = d;
    			}
    		}
    	}
    }

}