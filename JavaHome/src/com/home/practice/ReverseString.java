package com.home.practice;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverseString(String a) {
		char[] s = a.toCharArray();
		char temp;
		for(int i=0 , j=s.length-1 ; i<(s.length/2); i++,j--) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		System.out.println(new String(s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String s = sc.nextLine();
		reverseString(s);
		sc.close();
	}
}
