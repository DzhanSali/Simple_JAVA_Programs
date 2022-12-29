package homeworks.oop;

import java.util.Arrays;
import java.util.Scanner;

public class hw_012 {

	public static void main(String[] args) {

		System.out.println("�������� �����:");
		System.out.println("0. �����.");
		System.out.println("1. �������� �� ��������� �����.");
		System.out.println("2. �������� �� ���� � ������ �������� �� �������� �� �����");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		switch (num) {

		case 0:
			System.err.print("���� �� ����������!");
			break;

		case 1:
			System.out.println("�������� 10 �����, ���� ����� �� �� ������ ��������� ������.");
			caseOne();
			break;

		case 2:
			System.out.println("�������� �������� �� 10 ����� �� �������� �� ���� � ������ ��������.");
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
				System.out.println("��������� ����� e!");
			} else {
				System.out.println("���������� �������� �� � ��������� �����.");
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
			System.out.println("���� ���� �� �������: " + Arrays.stream(intErval2).sum());
		}

		double average = (double) Arrays.stream(intErval2).sum() / intErval2.length;
		System.out.println("�������� ����������� �������� �� ���������� �� ��� ����� �: " + average);
		
		main(null);
	}
}