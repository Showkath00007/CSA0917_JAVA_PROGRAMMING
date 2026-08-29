// Question: Write a Java program to convert a binary number to its decimal equivalent.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();

        long decimal = 0;
        long power = 1;
        long temp = binary;

        while (temp > 0) {
            long lastDigit = temp % 10;
            decimal += lastDigit * power;
            power *= 2;
            temp /= 10;
        }

        System.out.println("Decimal equivalent of " + binary + " is: " + decimal);
        sc.close();
    }
}
