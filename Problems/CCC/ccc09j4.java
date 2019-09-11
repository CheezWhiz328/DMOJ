import java.util.LinkedList;
import java.util.Scanner;

public class ccc09j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "WELCOME TO CCC GOOD LUCK TODAY";
		String[] A = S.split(" ");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		LinkedList<String> l = new LinkedList<String>();
		int total = 0;
		for (int i=0; i<A.length; i++) {
			boolean flag = false;
			if (total==0 && total+A[i].length()<=w) {
				l.add(A[i]);
				total = total +A[i].length();
			} else if (total!=0 && total+A[i].length()+1<=w) {
				l.add(A[i]);
				total = total +A[i].length()+1;
			} else {
				flag = true;
			}
			
			if (flag == true) {
				print(l, w);
				//System.out.println(l);
			}
			
			if (flag==true) {
				l = new LinkedList<String>();
				l.add(A[i]);
				total = A[i].length();
			}
			if (i==A.length-1) {
				print(l,w);
			}

		}

	}

	public static void print(LinkedList<String> l, int w) {
		int size = l.size();
		if (size==1) {
			System.out.print(l.get(0));
			for (int j=0; j<w-l.get(0).length();j++) {
				System.out.print(".");
			}
			System.out.println();
			return;
		} 
		int totalL = 0;
		for (int j=0; j<l.size(); j++) {
			totalL = totalL+l.get(j).length();
		}
		int dot = w-totalL;
		int dot1 = dot/(l.size()-1);
		int dot2 = dot%(l.size()-1);
		for (int j=0; j<l.size(); j++) {
			if (j!=0) {
				int dot3 = dot1;
				if (j<=dot2) {
					dot3++; 
				}
				for (int k=0; k<dot3; k++) {
					System.out.print(".");
				}
				
			}
			System.out.print(l.get(j));
		}
		System.out.println();
	}
}