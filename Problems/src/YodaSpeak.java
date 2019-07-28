import java.util.Scanner;

public class YodaSpeak {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] a = s.split(",");
		String b = a[1].substring(a[1].length()-1, a[1].length());
		a[1] = a[1].replace(b, "");
		a[1] = a[1].replaceFirst(" ", "");
		a[0] = a[0].replace(a[0].charAt(0), (char) (a[0].charAt(0)+32));
		if(a[1].charAt(0)>90) {
			a[1] = a[1].replace(a[1].charAt(0), (char) (a[1].charAt(0)-32));
		}
		System.out.println(a[1]+" "+a[0]+b);
		
	}
}
