package com.home.practice;

public class GreatestOf {
	
	public static void main(String args[]) {
		int a = 10;
		int b = 50;
		int c = 8;
		
		// greatest of 3 numbers
		System.out.println((a>b)?(a>c)?"a is greatest":"c is greatest":(b>c)?"b is greatest":"c is greatest");
		
		//greatest in array
		int arr[] = {10,60,80,50,20,80,60,90,30};
		int greatest = arr[0];
		for(int i = 1 ; i <= arr.length-1 ; i++) {
			if(greatest < arr[i]) {
				greatest = arr[i];
			}
		}
		System.out.println("Greatest Number In Array Is : "+greatest);
	}
}
