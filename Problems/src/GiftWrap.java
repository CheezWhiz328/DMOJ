import java.util.Scanner;

public class GiftWrap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		char c = (char)(a+97);
		for(int i=0; i<a; i++){
			int count=-1;
			for(int j=0; j<(a-1)*2+1; j++) {
				if(j<a &&count<i) {
					c--;
					count++;
				}if(j>a && j>(a-1)*2-i) {
					c++;
				}
				System.out.print(c);
				if(i==a-1&&j==a-1) {
					c++;
				}
			}
			c = (char)(a+97);
			System.out.println();
		}
		for(int i=a-2; i>=0; i--){
			int count=-1;
			for(int j=0; j<(a-1)*2+1; j++) {
				if(j<a &&count<i) {
					c--;
					count++;
				}if(j>a && j>(a-1)*2-i) {
					c++;
				}
				System.out.print(c);
				if(i==a-1&&j==a-1) {
					c++;
				}
			}
			c = (char)(a+97);
			System.out.println();
		}
		
	}

}
