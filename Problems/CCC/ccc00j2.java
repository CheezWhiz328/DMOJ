import java.util.Scanner;

public class ccc00j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int count = 0;
		int min = sc.nextInt();
		int max = sc.nextInt();

		for(int i = min; i<max+1; i++){
			String S = i+"";
			
			if(isRotatable(S)){
				count++;
			}
			
		}
		
		System.out.println(count);

	}

	public static boolean isRotatable(String S){
		for(int i=0; i<S.length(); i++){
			char forward = S.charAt(i);
			char backward = S.charAt(S.length()-1-i);
			if(forward==backward){
				if(forward!='0'&&forward!='1'&&forward!='8'){
					return false;
				}
			}else if(forward!='6'&&forward!='9'){
				return false;
			}else if(forward=='6'&&backward!='9'){
				return false;
			}else if(forward=='9'&&backward!='6'){
				return false;
			}
		}
		return true;	

	}	
}
