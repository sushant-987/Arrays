package com.iq;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		sc.close();

		String reversed = new StringBuilder(str).reverse().toString();

		if (str.equals(reversed)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

	}

}
