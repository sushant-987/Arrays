package com.array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize Scanner only once

        try {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid array size. Size should be greater than 0.");
                return;
            }

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Largest element: " + max);

        } finally {
            sc.close(); // Close Scanner in the end
        }
    }
}
