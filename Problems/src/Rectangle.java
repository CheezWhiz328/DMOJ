//calculate area and perimeter of rectangle

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int length = sc.nextInt();
		int area = width * length;
		int perimeter = (length + width) * 2;
		if (length <= 0 || width <= 0)
			System.out.println("That's not a rectangle you condescending twat");
		else
			System.out.println("the area is " + area + "\nthe perimeter is " + perimeter);
	}
}
