import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// too much work
public class APlusBhard {
	static String findSum(String str1, String str2) {
		// str 2 is larger
		String str = "";
		int n1;
		int n2;
		int carry = 0;
		if (str1.charAt(0) == '-' && str2.charAt(0) != '-' || str1.charAt(0) != '-' && str2.charAt(0) == '-') {
			str = "1";
			if (str1.charAt(0) == '-' && str2.charAt(0) != '-') {
				str1 = str1.substring(1);
				str1 = new StringBuilder(str1).reverse().toString();
				str2 = new StringBuilder(str2).reverse().toString();	
				n1 = str1.length();
				n2 = str2.length();			
//

			}else {
				
			}
			str = new StringBuilder(str).reverse().toString();
			return str;
		} else {
			if (str1.length() > str2.length()) {
				String t = str1;
				str1 = str2;
				str2 = t;
			}
			boolean a = true;

			if (str1.charAt(0) == '-' && str2.charAt(0) == '-') {
				a = false;
				str1 = str1.substring(1);
				str2 = str2.substring(1);
				n1 = str1.length();
				n2 = str2.length();
				str1 = new StringBuilder(str1).reverse().toString();
				str2 = new StringBuilder(str2).reverse().toString();
			} else {
				n1 = str1.length();
				n2 = str2.length();
				str1 = new StringBuilder(str1).reverse().toString();
				str2 = new StringBuilder(str2).reverse().toString();
			}

			for (int i = 0; i < n1; i++) {
				int sum = ((int) (str1.charAt(i) - '0') + (int) (str2.charAt(i) - '0') + carry);
				str += (char) (sum % 10 + '0');

				carry = sum / 10;
			}

			for (int i = n1; i < n2; i++) {
				int sum = ((int) (str2.charAt(i) - '0') + carry);
				str += (char) (sum % 10 + '0');
				carry = sum / 10;
			}

			if (carry > 0) {
				str += (char) (carry + '0');
			}

			if (a) {
				str = new StringBuilder(str).reverse().toString();
			} else {
				str = "-" + new StringBuilder(str).reverse().toString();
			}
		}
		
		if(str.charAt(0)=='0') {
			while(str.charAt(0)=='0') {
				str = str.substring(1);
			}
		}else if(str.charAt(0)=='-'&&str.charAt(1)=='0') {
			str = "-" + str.substring(2);
		}else {
			
		}
		return str;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			String[] tmp = br.readLine().split(" ");
			String n = tmp[0];
			String m = tmp[1];

			System.out.println(findSum(n,m));
		}

	}
}