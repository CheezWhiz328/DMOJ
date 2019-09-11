import java.util.Scanner;

public class ccc05s2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int posX = sc.nextInt();
		int posY = sc.nextInt();
		if(posX>a){
			posX=a;
		}if(posX<0){
			posX=0;
		}if(posY>b){
			posY=b;
		}if(posY<0){
			posY=0;
		}
		if(posX==0&&posY==0){
			System.exit(0);
		}
		System.out.println(posX+" "+posY);
		
		
		while(true){
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if(X==0&&Y==0){
				break;
			}
			
			posX+=X;
			posY+=Y;
			
			if(posX>a){
				posX=a;
			}if(posX<0){
				posX=0;
			}if(posY>b){
				posY=b;
			}if(posY<0){
				posY=0;
			}
			
			System.out.println(posX+" "+posY);
		}
	}
}
