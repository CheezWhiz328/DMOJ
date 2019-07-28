import java.util.Scanner;

public class Harambe {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int k = sc.nextInt();
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)== ' ' && s2.charAt(i)!= ' ' || s2.charAt(i)== ' ' && s1.charAt(i)!= ' ') {
				System.out.println("No plagiarism");
				System.exit(0);
			}
			
			if(s1.charAt(i)!=s2.charAt(i)) {
				k--;
			}
			if(k<0) {
				System.out.println("No plagiarism");
				System.exit(0);
			}
		}System.out.println("Plagiarized");
	}
}
