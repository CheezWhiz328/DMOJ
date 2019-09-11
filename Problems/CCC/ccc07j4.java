import java.util.*;
public class ccc07j4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String Nagaram = sc.nextLine();
		String Anagram = sc.nextLine();
		Nagaram=Nagaram.replaceAll(" ","");
		Anagram=Anagram.replaceAll(" ","");
		
		char[] a1 = Nagaram.toCharArray();
		char[] a2 = Anagram.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		boolean flag = false;
		for(int i=0; i<a1.length; i++){
			if(a1.length!=a2.length){
				flag=true;
				break;
			}
			if(a1[i]!=a2[i]){
				flag = true;
				break;
			}
		}
		
		if(!flag)
		System.out.println("Is an anagram.");	
			
		if(flag)	
			System.out.println("Is not an anagram.");		
		
	}
}