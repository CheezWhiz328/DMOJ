import java.util.Scanner;


public class spreadsheet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] a = {{"1","2","3","A2","A3"},{"B2","4","5","6","7"},{"C5","8","9","10","11"}} ;
		String s = sc.next();
		int row = 0;
		int col = 0;
		while(s.length()!=1) {
			row = s.charAt(0)-'A';
			col = s.charAt(1)-'1';
			s = a[row][col];
			
		}System.out.println(a[row][col]);
		
	}
}