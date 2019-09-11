import java.util.Scanner;

public class ccc02j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			String word = sc.nextLine();
			
			if(word.equals("quit!")){
				break;
			}
			
			boolean flag = true;
			char word1 = word.charAt(word.length()-3);
			
			if(word1=='a'||word1=='e'||word1=='i'||word1=='o'||word1=='u'||word1=='y'){
				flag = false;
			}		
				
			if(word.substring(word.length()-2,word.length()).equals("or")&&word.length()>4&&flag){
					
				System.out.println(word.substring(0, word.length()-2)+"our");
					
			}else{
			
				System.out.println(word);
			}
		}
		
	}
}