import java.util.Scanner;

public class BobsFirstSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		count+= sc.nextInt()*5;
		count+= sc.nextInt()*10;
		count+= sc.nextInt()*25;
		count+= sc.nextInt()*100;
		count+= sc.nextInt()*200;
		System.out.println(count);
	}
}
