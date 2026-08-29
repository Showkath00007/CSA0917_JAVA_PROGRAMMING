// Question: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int a = n1;
        int b = n2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + a);
        sc.close();
    }
}
