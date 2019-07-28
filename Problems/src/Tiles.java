import java.util.Scanner;

public class Tiles {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int width = sc.nextInt();
		int square = sc.nextInt();
		System.out.println((int)(Math.floor(length/square)*Math.floor(width/square)));
	}
}
