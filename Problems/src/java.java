import java.util.Scanner;

public class java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if(s.contains("java")){
			System.out.println(s.indexOf("java"));
		}else {
			System.out.println(s.length());
		}
	}
}
