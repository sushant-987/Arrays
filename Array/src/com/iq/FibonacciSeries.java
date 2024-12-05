package com.iq;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int number = sc.nextInt();
		sc.close();

		int a = 0, b = 1;
		System.out.print("Fibonacci Series: " + a + ", " + b);

		for (int i = 2; i < number; i++) {
			int next = a + b;
			System.out.println(", " + next);
			a = b;
			b = next;

		}

	}

}
