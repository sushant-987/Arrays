package com.array;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Welcome to the Calculator Program!");
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulo (%)");

            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            double result = 0;
            boolean valid = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result of addition: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result of subtraction: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result of multiplication: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result of division: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed!");
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Result of modulo: " + result);
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed!");
                    }
                    break;
                default:
                    valid = false;
                    System.out.println("Invalid choice. Please select a valid operation.");
            }

            if (valid) {
                System.out.println("Calculation complete. Thank you!");
            }

        } finally {
            sc.close(); // Ensure Scanner is closed
        }
    }
}
