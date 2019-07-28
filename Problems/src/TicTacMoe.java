import java.util.Scanner;

public class TicTacMoe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[][] a = new char[3][3];
		for(int i=0; i<3; i++) {
			String s = sc.next();
			a[i][0] = s.charAt(0);
			a[i][1] = s.charAt(1);
			a[i][2] = s.charAt(2);
		}
		
		boolean o = false;
		boolean x = false;
		for(int i=0; i<3; i++) {
			if(a[i][0]=='O'&&a[i][1]=='O'&&a[i][2]=='O') {
				o = true;
			}if(a[0][i]=='O'&&a[1][i]=='O'&&a[2][i]=='O') {
				o = true;
			}if(a[i][0]=='X'&&a[i][1]=='X'&&a[i][2]=='X') {
				x = true;
			}if(a[0][i]=='X'&&a[1][i]=='X'&&a[2][i]=='X') {
				x = true;
			}
		}
		
		if(a[0][0]=='O'&&a[1][1]=='O'&&a[2][2]=='O') {
			o = true;
		}if(a[0][2]=='O'&&a[1][1]=='O'&&a[2][0]=='O') {
			o = true;
		}if(a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X') {
			x = true;
		}if(a[0][2]=='X'&&a[1][1]=='X'&&a[2][0]=='X') {
			x = true;
		}
		
		if(o&&x) {
			System.out.println("Error, redo");
		}if(o&&!x) {
			System.out.println("Griffy");
		}if(x&&!o) {
			System.out.println("Timothy");
		}if(!x&&!o) {
			System.out.println("Tie");
		}		

		
	}
}
