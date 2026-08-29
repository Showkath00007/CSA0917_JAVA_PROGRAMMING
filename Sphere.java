// Question: Write a Java program to calculate the volume and surface area of a sphere given its radius.

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        double radius = sc.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);

        System.out.println("Volume of the sphere: " + volume);
        System.out.println("Surface Area of the sphere: " + surfaceArea);
        sc.close();
    }
}
