package com.home.practice;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		// using third variable
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping: "+"\na = "+a+"\nb = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping: "+"\na = "+a+"\nb = "+b);
		
		// without using third variable
		System.out.println("Before Swapping: "+"\na = "+a+"\nb = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping: "+"\na = "+a+"\nb = "+b);
	}
}
