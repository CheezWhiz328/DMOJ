import java.util.Scanner;

public class Yoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		boolean flag = true;
		if(b.length()>a.length()) {
			String c = a;
			a = b;
			b = c; 
			flag = false;
		}

		int[] hi = new int[a.length()];
		int[] bye = new int[a.length()];
		for(int i=0; i<a.length(); i++) {
			hi[i] = Integer.parseInt(a.substring(i, i+1));
			if(i>=b.length()-a.length()) {
				bye[i] = b.charAt(i)-48;
			}else {
				bye[i] = 0;
			}
		}
		
		for(int i=0; i<a.length(); i++) {
			System.out.println(hi[i]+" "+bye[i]);
		}

	}

}