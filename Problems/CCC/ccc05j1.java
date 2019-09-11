import java.util.Scanner;

public class ccc05j1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		
		double d1 = d;
		double e1 = e;
		double w1 = w;
		double d2 = d;
		double e2 = e;
		double w2 = w;
		
		d1 -= 100;
		if(d1<0){
			d1=0;
		}
		d1 *= 0.25;	
		e1 *= 0.15;
		w1 *= 0.2;
		
		float planA = (float) (d1+e1+w1);
		
		d2 -= 250;
		if(d2<0){
			d2=0;
		}	
		d2 *= 0.45;
		e2 *= 0.35;
		w2 *= 0.25;
		
		float planB = (float) (d2+e2+w2);
		System.out.println("Plan A costs "+planA);
		System.out.println("Plan B costs "+planB);
		
		if(planA<planB){
			System.out.println("Plan A is cheapest.");
		}else if(planB<planA){
			System.out.println("Plan B is cheapest.");
		}else if(planA==planB){
			System.out.println("Plan A and B are the same price.");
		}
		
	}
}