package homework1;

import java.util.Scanner;

public class Hm1_triangle {

	public static void main(String[] args) {
		System.out.println("Please enter the dimensions of a triangle.");

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a + b == c || a + c == b || b + c == a) {

			if (a == b || a == c || b == c) {
				System.out.println("This triangle is isosceles.");
			}

			if (a != b && a != c && b != c) {
				System.out.println("This triangle is scalene.");
			}

		} else if (a == b && a == c && b == c) {
			System.out.println("This triangle is equilateral.");
		}

		else {
			System.out.println("The parameters you entered do no represent a triangle in any way. Please try again :)");
		}
	}

}
