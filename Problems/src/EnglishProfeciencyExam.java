import java.util.Scanner;

public class EnglishProfeciencyExam {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] S1 = S.split(" ");
		int count = 0;
		int count1 = 0;
		for(int i=0; i<S1.length; i++) {
			for(int j=0; j<S1[i].length();j++) {
				System.out.print(S1[i]);
			}
		}
	}
}