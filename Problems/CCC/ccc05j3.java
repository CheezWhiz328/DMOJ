import java.util.Scanner;
import java.util.Stack;

public class ccc05j3 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Stack<String> A = new Stack<String>();	
		while(true){
			String S = sc.nextLine();
		
			if(S.equals("SCHOOL")){
				break;
			}
			
			A.push(S);
		}
		
		while(true){
			String D = A.pop();
			String Direction = "";
			if(D.equals("L")){
				Direction = "RIGHT";
			}
			else if(D.equals("R")){
				Direction = "LEFT";
			}
			if(A.isEmpty()){
				System.out.println("Turn "+Direction+" into your HOME.");
				break;
				
			}else{
				String Street = A.pop();
				System.out.println("Turn "+Direction+" onto " + Street + " street.");
			}
			
		}
	}
}