package org.program;

public class Arraysorting {
public static void main(String[] args) {
	int []a= {10,90,30,70,40};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]>a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("After sorting");
	for (int i : a) {
		System.out.println(i);
	}
	System.out.println("Largest="+a[a.length-1]);
	System.out.println("2ndLargest="+a[a.length-2]);
	System.out.println("smallest="+a[0]);
}
}
