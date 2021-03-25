package org.program;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num, rem=0,res =0, count=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number to find armstrong");
	
	int a = s.nextInt();
		num =a;
		
		String valueOf = String.valueOf(a);
		int length = valueOf.length();
	while (num>0) {
		rem = num%10;
		res= res+=Math.pow(rem, length);
		num=num/10;
	}
	if (a == res) {
		System.out.println("Entered number is armstrong");
	}
	else {
		System.out.println("Entered number is not armstrong");
	}
	
}

}


