package com.iq;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		String reversed = "";
		sc.close();

		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}

		System.out.println("Reversed String: " + reversed);

	}

}
