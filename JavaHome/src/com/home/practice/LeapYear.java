package com.home.practice;

import java.util.Scanner;

public class LeapYear {
	
	public static void leapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year to check if it is leap year or not: ");
		int year = sc.nextInt();
		
		leapYear(year);
		
		sc.close();
	}
}