import java.util.Scanner;

public class ccc11s1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Tcount = 0;
		int Scount=0;
		for(int i=0; i<=N; i++){
			String Nline =sc.nextLine();
			for(int j=0; j<Nline.length(); j++){
				if(Nline.charAt(j)==84||Nline.charAt(j)==116){
					Tcount++;
				}if(Nline.charAt(j)==83||Nline.charAt(j)==115){
					Scount++;
				}
			}
			
		}
		if(Tcount>Scount){
			System.out.println("English");
		}else{
			System.out.println("French");
		}
		

	}
}