package org.program;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	int number = 121;
	int res = 0;
	int rem =0;
	int n = number;
//	System.out.println("enter number");
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
	
	
	while (number>0) {
		rem = number%10;
		res = rem+(res*10);
		number=number/10;
	}
	if ( n==res)
		System.out.println("is palindrome");
	else {
		System.out.println("not palindrome");
	}
System.out.println("done1");
	
}
}
