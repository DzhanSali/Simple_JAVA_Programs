package homeworks.oop;

import java.util.Arrays;
import java.util.Scanner;

public class hw_012 {

	public static void main(String[] args) {

		System.out.println("Изберете опция:");
		System.out.println("0. Изход.");
		System.out.println("1. Намиране на перфектни числа.");
		System.out.println("2. Намиране на сума и средна стойност на интервал от числа");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		switch (num) {

		case 0:
			System.err.print("Край на програмата!");
			break;

		case 1:
			System.out.println("Въведете 10 числа, сред които да се търсят перфектни такива.");
			caseOne();
			break;

		case 2:
			System.out.println("Въведете интервал от 10 числа за намиране на сума и средна стойност.");
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
				System.out.println("Перфектно число e!");
			} else {
				System.out.println("Въведената стойност не е перфектно число.");
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
			System.out.println("Обща сума до момента: " + Arrays.stream(intErval2).sum());
		}

		double average = (double) Arrays.stream(intErval2).sum() / intErval2.length;
		System.out.println("Средната аритметична стойност на въведените от Вас числа е: " + average);
		
		main(null);
	}
}