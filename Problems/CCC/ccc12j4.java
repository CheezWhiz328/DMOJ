import java.util.Scanner;

public class ccc12j4 {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		String word = sc.next();
		String decode = "";
		char c = 'a';
		for(int i = 0; i<word.length(); i++){
			 c = word.charAt(i);
			 decode = decode+(char) (((c - 'A' - (3*(i+1)+inp))+260)%26+'A');;
		}
		System.out.println(decode);
	}

}