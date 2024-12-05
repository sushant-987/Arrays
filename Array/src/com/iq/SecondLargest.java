package com.iq;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
				sc.close();
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No Second largest element.");
		} else {
			System.out.println("Second largest element: " + secondLargest);
		}

	}

}
