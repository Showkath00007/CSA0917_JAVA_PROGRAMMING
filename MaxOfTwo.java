// Question: Write a Java program to find the maximum of two numbers.

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Maximum is: " + num1);
        } else {
            System.out.println("Maximum is: " + num2);
        }
        sc.close();
    }
}
