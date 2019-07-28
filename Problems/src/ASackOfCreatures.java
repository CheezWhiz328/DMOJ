import java.util.Scanner;

public class ASackOfCreatures {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		while(true) {
			count++;
			String s = sc.next();
			System.out.println("\tif(N=="+count+"){");
			System.out.println("\t\treturn \""  +s + "\";");
			System.out.println("\t}");
		}
	}
}
