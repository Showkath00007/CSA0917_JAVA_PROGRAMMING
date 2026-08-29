// Question: Write a Java program to find the second maximum number in an array.

import java.util.Scanner;

public class SecondMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Array size must be at least 2.");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum number (all elements might be equal).");
        } else {
            System.out.println("Second maximum number in the array is: " + secondMax);
        }
        sc.close();
    }
}
