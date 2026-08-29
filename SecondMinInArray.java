// Question: Write a Java program to find the second minimum number in an array.

import java.util.Scanner;

public class SecondMinInArray {
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

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum number (all elements might be equal).");
        } else {
            System.out.println("Second minimum number in the array is: " + secondMin);
        }
        sc.close();
    }
}
