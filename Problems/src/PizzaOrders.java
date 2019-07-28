import java.util.Scanner;

public class PizzaOrders {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	System.out.printf("%.0f",Math.ceil(a/3)+Math.ceil(b/3)+Math.ceil(c/3));
	}
}
