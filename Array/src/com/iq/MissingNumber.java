package com.iq;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array (n-1): ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int totalSum = (n + 1) * (n + 2) / 2;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			sc.close();
		}

		System.out.println("Missing number: " + (totalSum - sum));
	}
}
