package com.home.practice;

import java.util.Scanner;

public class Factorial {

	public static void factorialLoop(int n) {
		
		if(n == 0 || n == 1) {
			System.out.println("Factorial of "+n+" is 1");
		}
		else {
			long fact = 1;
			for(int i = 2 ; i <= n ; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
		}
	}
	
	public static long factorialRecursive(int n) {
		
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * Factorial.factorialRecursive(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial: ");
		int n = sc.nextInt();
		
		if(n<0) {
			System.out.println("Enter a valid positive number");
			return;
		}
		
		factorialLoop(n);
		
		System.out.println("Factorial of "+n+" is "+factorialRecursive(n));
		sc.close();
	}
}
