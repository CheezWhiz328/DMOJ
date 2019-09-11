import java.util.LinkedList;
import java.util.Scanner;
public class ccc09s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		String[] light = new String[R];
		for (int r=0; r<R; r++) {
			light[r] = sc.nextLine().replaceAll(" ", "");
		}

		LinkedList<String> previous = new LinkedList<String>();
		LinkedList<String> current = new LinkedList<String>();

		//Add that String to previous
		previous.add(light[0]);
		for (int r=1; r<R; r++) {
			current = new LinkedList<String>();
			String O = light[r];
			current.add(O);

			for (int i=0; i<previous.size(); i++) {
				String p = previous.get(i);
				String combine = combine(O, p);
				if (!current.contains(combine)) {
					current.add(combine);
				}
			}	
			previous = current;
		}
		System.out.println(current.size());
	}

	public static String combine(String O, String p) {
		String S = ""; 
		for (int i=0; i<O.length(); i++) {
			if (O.charAt(i)==p.charAt(i)) {
				S += "0";
			} else {
				S += "1";
			}
		}
		return S;
	}

}