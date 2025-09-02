package com.home.practice;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void primeRange(int s, int e) {
		if(s>e) {
			return;
		}
		System.out.println("List of Prime Numbers Between "+s+" and "+e);
		loop_1:	for(int i = s; i <= e; i++) {
				if(i<=1) {
					continue;
				}
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						continue loop_1;
					}
				}
				System.out.print(i+" ");
		}
//		for (int i = s; i <= e; i++) {
//	        if (i <= 1) continue;
//	        boolean isPrime = true;
//	        for (int j = 2; j <= Math.sqrt(i); j++) {
//	            if (i % j == 0) {
//	                isPrime = false;
//	                break;
//	            }
//	        }
//	        if (isPrime) {
//	            System.out.print(i + " ");
//	        }
//	    }
	}
	
	public static void efficient(int num)
	{
		for(int i = 2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) {
				System.out.println("Not a Prime Number");
				return;
			}
		}
		System.out.println("Is a Prime Number");
	}
	
	public static void inefficient(int num) {
		for(int i = 2; i <=num/2; i++) {
			if(num%i == 0){
				System.out.println("Not a Prime Number");
				return;
			}
		}
		System.out.println("Is a Prime Number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number of range: ");
		int s = sc.nextInt();
		System.out.println("Enter the ending number of range: ");
		int e = sc.nextInt();
		primeRange(s,e);
		
		System.out.println("\nEnter the number to check if it is prime number or not: ");
		int num = sc.nextInt();
		if(num <= 1) {
			System.out.println("Number is not a Prime Number");
			return;
		}
		
		inefficient(num);
		
		efficient(num);
		
		sc.close();
	}
}
