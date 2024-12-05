package com.iq;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		sc.close();

		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;

		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number");

		}

	}

}
