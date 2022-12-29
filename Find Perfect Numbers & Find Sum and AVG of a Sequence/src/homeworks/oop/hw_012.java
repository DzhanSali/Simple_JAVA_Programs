package homeworks.oop;

import java.util.Arrays;
import java.util.Scanner;

public class hw_012 {

	public static void main(String[] args) {

		System.out.println("Select an option:");
		System.out.println("0. Exit.");
		System.out.println("1. Finding Perfect Numbers.");
		System.out.println("2. Finding SUM & AVG of a Sequence");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		switch (num) {

		case 0:
			System.err.print("End of program!");
			break;

		case 1:
			System.out.println("Enter 10 Numbers And I Will Find The Perfect Ones");
			caseOne();
			break;

		case 2:
			System.out.println("Enter A Sequence Of 10 Numbers And I Will Find Their Average And Their Sum");
			caseTwo();
			break;
		}
	}

	static void caseOne() {
		int[] intErval;
		intErval = new int[10];
	
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			intErval[i] = in.nextInt();

			int u = 1, sum = 0;
			int number = intErval[i];
			while (u < number) {
					if (number % u == 0) {
					sum = sum + u;}
				u++;}

			if (sum == number) {
				System.out.println("It's a perfect number!");
			} else {
				System.out.println("Entered value is not a perfect number.");
			}
		}
		main(null);
	}

	static void caseTwo() {
		int[] intErval2;
		intErval2 = new int[10];

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			intErval2[i] = in.nextInt();
			System.out.println("Total SUM up to now: " + Arrays.stream(intErval2).sum());
		}

		double average = (double) Arrays.stream(intErval2).sum() / intErval2.length;
		System.out.println("The average aritmethic value of the sequence is: " + average);
		
		main(null);
	}
}