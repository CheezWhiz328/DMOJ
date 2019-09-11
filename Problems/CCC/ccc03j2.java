import java.util.Scanner;

public class ccc03j2 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			
			int a = sc.nextInt();
			
			if(a==0){
				break;
			}
							
				int length = (int) (Math.sqrt(a));
				length = (int) Math.floor(length);
				
				while(true){
					
					if(a%length==0){
						int width = a/length;
						int perimeter = (length+width)*2;
						System.out.println("Minimum perimeter is "+perimeter+" with dimensions "+length+" x "+width);
						break;					
					}
					length--;		
				}			
		}
		
	}
}