import java.util.*;
public class ccc15j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String inpstr = sc.nextLine();
		//a b c d e f g h i j k l  m n o p q r s t u v w x y z
		 
		inpstr = inpstr.replace("z","zuz");
		inpstr = inpstr.replace("y","yuz");
		inpstr = inpstr.replace("x","xuy");
		inpstr = inpstr.replace("w","wux");
		inpstr = inpstr.replace("v","vux");
		inpstr = inpstr.replace("t","tuv");
		inpstr = inpstr.replace("s","sut");
		inpstr = inpstr.replace("r","ros");
		inpstr = inpstr.replace("q","qor");
		inpstr = inpstr.replace("p","poq");
		inpstr = inpstr.replace("n","nop");
		inpstr = inpstr.replace("m","mon");
		inpstr = inpstr.replace("l","lim");
		inpstr = inpstr.replace("k","kil");
		inpstr = inpstr.replace("j","jik");
		inpstr = inpstr.replace("h","hij");
		inpstr = inpstr.replace("g","geh");
		inpstr = inpstr.replace("f","feg");
		inpstr = inpstr.replace("d","def");
		inpstr = inpstr.replace("c","cad");
		inpstr = inpstr.replace("b","bac");
		
		//backward replace one by one
		System.out.println(inpstr);
	}

}