import java.util.Scanner;

public class die {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		char[][] side = new char[3][3];
		for(int i=0; i<3; i++) {
			String S = sc.nextLine();
			for(int j=0; j<3; j++) {
				side[i][j] = S.charAt(j);
			}
		}
		
		if(side[0][0] == ':' && side[0][1] == ':' && side[0][2] == ':' && side[1][0] == ':' && side[1][1] == 'o' && side[1][2] == ':' && side[2][0] == ':' && side[2][1] == ':' && side[2][2] == ':') {
			System.out.println(1);
		}else if(side[0][0] == 'o' && side[0][1] == ':' && side[0][2] == ':' && side[1][0] == ':' && side[1][1] == ':' && side[1][2] == ':' && side[2][0] == ':' && side[2][1] == ':' && side[2][2] == 'o') {
			System.out.println(2);
		}else if(side[0][0] == ':' && side[0][1] == ':' && side[0][2] == 'o' && side[1][0] == ':' && side[1][1] == ':' && side[1][2] == ':' && side[2][0] == 'o' && side[2][1] == ':' && side[2][2] == ':') {
			System.out.println(2);
		}else if(side[0][0] == 'o' && side[0][1] == ':' && side[0][2] == ':' && side[1][0] == ':' && side[1][1] == 'o' && side[1][2] == ':' && side[2][0] == ':' && side[2][1] == ':' && side[2][2] == 'o') {
			System.out.println(3);
		}else if(side[0][0] == ':' && side[0][1] == ':' && side[0][2] == 'o' && side[1][0] == ':' && side[1][1] == 'o' && side[1][2] == ':' && side[2][0] == 'o' && side[2][1] == ':' && side[2][2] == ':') {
			System.out.println(3);
		}else if(side[0][0] == 'o' && side[0][1] == ':' && side[0][2] == 'o' && side[1][0] == ':' && side[1][1] == ':' && side[1][2] == ':' && side[2][0] == 'o' && side[2][1] == ':' && side[2][2] == 'o') {
			System.out.println(4);
		}else if(side[0][0] == 'o' && side[0][1] == ':' && side[0][2] == 'o' && side[1][0] == ':' && side[1][1] == 'o' && side[1][2] == ':' && side[2][0] == 'o' && side[2][1] == ':' && side[2][2] == 'o') {
			System.out.println(5);
		}else if(side[0][0] == 'o' && side[0][1] == 'o' && side[0][2] == 'o' && side[1][0] == ':' && side[1][1] == ':' && side[1][2] == ':' && side[2][0] == 'o' && side[2][1] == 'o' && side[2][2] == 'o') {
			System.out.println(6);
		}else if(side[0][0] == 'o' && side[0][1] == ':' && side[0][2] == 'o' && side[1][0] == 'o' && side[1][1] == ':' && side[1][2] == 'o' && side[2][0] == 'o' && side[2][1] == ':' && side[2][2] == 'o') {
			System.out.println(6);
		}else {
			System.out.println("unknown");
		}
	}
}
