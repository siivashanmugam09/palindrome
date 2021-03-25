package org.program;

import java.util.Scanner;

public class ProductOfNumber {
public static void main(String[] args) {
	int num, rem=0,res =1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number to multiply");
	int a = s.nextInt();
	num =a;
	while (a>0) {
		rem= a%10;
		res=rem*res;
		a=a/10;
	}
	System.out.println("product="+res);
}
}
