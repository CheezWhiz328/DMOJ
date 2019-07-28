import java.util.Scanner;

public class Shoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        s = s.replace(" ", "");
        int Lc = -1;
        int Rc = 0;
        char[] a = s.toCharArray();
        for(int i=0; i<4; i++) {
        	if(a[i]=='L') {
        		Lc+=2;
        		System.out.print(Lc+" ");
        	}else if(a[i]=='R') {
        		Rc+=2;
        		System.out.print(Rc+" ");
        	}
        	
        	if(i==1) {
        		System.out.println();
        	}
        }
    }
}
