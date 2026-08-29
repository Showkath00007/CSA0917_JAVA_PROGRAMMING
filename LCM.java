// Question: Write a Java program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class LCM {
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
        int gcd = a;
        int lcm = (n1 * n2) / gcd;

        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
        sc.close();
    }
}
