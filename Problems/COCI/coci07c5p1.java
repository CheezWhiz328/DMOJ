import java.util.Scanner;

public class coci07c5p1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b==c){
			System.out.println(a+"+"+b+"="+c);
			System.exit(0);
		}
		
		if(a+c==b){
			System.out.println(a+"="+b+"-"+c);
			System.exit(0);
		}
		
		if(c+b==a){
			System.out.println(a+"="+b+"+"+c);
			System.exit(0);
		}
		
		if(a*b==c){
			System.out.println(a+"*"+b+"="+c);
			System.exit(0);
		}
		
		if(a*c==b){
			System.out.println(a+"="+b+"/"+c);
			System.exit(0);
		}
		
		if(c*b==a){
			System.out.println(a+"="+b+"*"+c);
			System.exit(0);
		}
		
	}

}
