//���� ���� �� 2101321036

package homework1;

import java.util.Scanner;

public class Hm1_triangle {

	public static void main(String[] args) {
		System.out.println("���� �������� ������� �� ��� ������ �� ����������.");

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a + b == c || a + c == b || b + c == a) {

			if (a == b || a == c || b == c) {
				System.out.println("������������ � �����������.");
			}

			if (a != b && a != c && b != c) {
				System.out.println("������������ � ������������.");
			}

		} else if (a == b && a == c && b == c) {
			System.out.println("������������ � ������������.");
		}

		else {
			System.out.println("���������� ��������� �� ����������� �� ����������. �������� ��� :)");
		}
	}

}
