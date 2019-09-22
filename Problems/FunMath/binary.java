import java.util.Scanner;

public class binary {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++){
			int a = sc.nextInt();
			String X = "";
			int count = 0;
			int spaceC = 0;
			if(a==0){
				X="0000";
			}
			while(a>=1){
				if(count%4==0){
					X=X+" ";
					spaceC++;
				}
				if(a%2==0){
					X=X+"0";
					a=a/2;
				}else{
					X=X+"1";
					a=a/2;			
				}
				count++;
			}
			String Xreversed = "";
			for(int j=X.length()-1; j>=0; j--){
				Xreversed = Xreversed+X.charAt((j));
			}
			if(4-(X.length()-spaceC)%4!=4){
				for(int h=0; h<4-(X.length()-spaceC)%4; h++){
					Xreversed = "0"+Xreversed;
				}
			}

			Xreversed=Xreversed.trim();
			System.out.println(Xreversed);
		}
		
	}
}