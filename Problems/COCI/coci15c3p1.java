import java.util.Scanner;

public class coci15c3p1 {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int sum = 0;
    	for(int i=0; i<a; i++){
    		String inp = sc.next();		
    		String inp1=inp.substring(0,inp.length()-1);
    		int base = Integer.valueOf(inp1);
    		String power1=inp.substring(inp.length()-1,inp.length());
    		int power = Integer.valueOf(power1);
    		sum+=Math.pow(base,power);
    		
    	}
    	System.out.println(sum);
    }
}