package org.program;

import java.util.Scanner;

public class Sumofdigit {
	public static void main(String[] args) {
		int num, res = 0, rem = 0;
		System.out.println("Enter number to sum");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		num = a;
		while (a > 0) {
			rem = num % 10;
			res = res + rem;
			a = a / 10;

		}
		System.out.println(res);
	}
}
