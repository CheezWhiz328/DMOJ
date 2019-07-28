import java.util.Scanner;

public class Goon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		if(s.charAt(0)+s.charAt(1)+s.charAt(2)==s.charAt(4)+s.charAt(5)+s.charAt(6)&&s.charAt(4)+s.charAt(5)+s.charAt(6)==s.charAt(8)+s.charAt(9)+s.charAt(10)+s.charAt(11)-48) {
			System.out.println("Goony!");
		}else {
			System.out.println("Pick up the phone!");
		}
		
	}
}
