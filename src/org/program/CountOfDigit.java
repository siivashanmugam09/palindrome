package org.program;

import java.util.Scanner;

public class CountOfDigit {
public static void main(String[] args) {
	int num, res =0,rem=0,count=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number to Count");
	int a = s.nextInt();
	num =a;
	while (a>0) {
		rem = a%10;
		count++;
		a=a/10;
	}System.out.println("count of digit="+count);
}
}
