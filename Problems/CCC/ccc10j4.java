import java.util.Scanner;

public class ccc10j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true){
			int a = sc.nextInt();
			
			if(a==0){
				break;
			}
			if(a==1){
				a = sc.nextInt();
				System.out.println(0);
				continue;
			}
			
			int[] eskeetit = new int[a];
			for(int i=0; i<a; i++){
				eskeetit[i] = sc.nextInt();
			}


			int[] Balloon = new int[a-1];
			for(int i=0; i<a-1; i++){			
				Balloon[i] = eskeetit[i+1]-eskeetit[i];
			}

			for(int l=1; l<=a; l++){
				boolean flag = true;
				for(int i=0; i<a-1-l; i++){
					if(Balloon[i]!=Balloon[i+l]){
						flag = false;
						break;
					}
				}
				if(flag){
					System.out.println(l);
					break;
				}
			}
		}
	}
}