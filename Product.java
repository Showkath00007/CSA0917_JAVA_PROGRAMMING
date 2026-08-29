// Question: Write a Java program to find the product of two numbers.

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double product = num1 * num2;
        System.out.println("The product is: " + product);
        sc.close();
    }
}
