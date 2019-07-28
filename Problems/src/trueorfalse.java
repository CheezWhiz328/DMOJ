import java.util.Scanner;

public class trueorfalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		if(a.equals("")) {
			System.out.println("True");
		}
		int NotCount = 0;
		for(int i=0; i<a.length()-7; i+=4) {
			if(a.charAt(i)=='n') {
				NotCount++;
			}
		}
		
		if(a.contains("True")) {
			if(NotCount%2==0) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}if(a.contains("False")){
			if(NotCount%2==1) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}

	}

}
