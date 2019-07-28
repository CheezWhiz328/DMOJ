import java.util.Scanner;

public class diagonalLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(i+""+j+" ");
			}System.out.println();
		}
	}
}
