import java.util.Scanner;

public class ccc07j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			String a = sc.next();
		
			if(a.contains("TTYL")){
				a=a.replaceAll("TTYL", "talk to you later");
				System.out.println(a);
				break;
			}if(a.contains("CU")){
				a=a.replaceAll("CU", "see you");
			}if(a.contains(":-)")){
				a=a.replaceAll(":-\\)", "I'm happy");
			}if(a.contains(":-(")){
				a=a.replaceAll(":-\\(", "I'm unhappy");
			}if(a.contains(";-)")){
				a=a.replaceAll(";-\\)", "wink");
			}if(a.contains(":-p")){
				a=a.replaceAll(":-\\p", "stick out my tongue");
			}if(a.contains("(~.~)")){
				a=a.replaceAll("\\(~.~\\)", "sleepy");
			}if(a.contains("TA")){
				a=a.replaceAll("TA", "totally awesome");
			}if(a.contains("CCC")){
				a=a.replaceAll("CCC", "Canadian Computing Competition");
			}if(a.contains("CUZ")){
				a=a.replaceAll("CUZ", "because");
			}if(a.contains("TY")){
				a=a.replaceAll("TY", "thank-you");
			}if(a.contains("YW")){
				a=a.replaceAll("YW", "you're welcome");
			}	
			System.out.println(a);
		}
	}
}