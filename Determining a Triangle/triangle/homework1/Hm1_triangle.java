//Джан Сали ФН 2101321036

package homework1;

import java.util.Scanner;

public class Hm1_triangle {

	public static void main(String[] args) {
		System.out.println("Моля въведете дължини на три страни на триъгълник.");

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a + b == c || a + c == b || b + c == a) {

			if (a == b || a == c || b == c) {
				System.out.println("Триъгълникът е равнобедрен.");
			}

			if (a != b && a != c && b != c) {
				System.out.println("Триъгълникът е разностранен.");
			}

		} else if (a == b && a == c && b == c) {
			System.out.println("Триъгълникът е равностранен.");
		}

		else {
			System.out.println("Въведените параметри не съответсват на триъгълник. Опитайте пак :)");
		}
	}

}
