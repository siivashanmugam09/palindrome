package org.program;

import java.util.Scanner;

public class Fibonnaci {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter required number of times");
	int n = s.nextInt();
	System.out.println("Enter first number");
	int a = s.nextInt();
	System.out.println("Enter second number");
	int b = s.nextInt();
	System.out.println("Fibonnaci series are");
	System.out.println(a);
	System.out.println(b);
	for (int i = 0; i <=n; i++) {
		int c = a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	
}
}
