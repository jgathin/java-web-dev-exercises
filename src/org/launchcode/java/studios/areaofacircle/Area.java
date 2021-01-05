package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter the radius for the circle: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        input.close();

        System.out.println("The area of a circle with radius " + radius + " is: " + area);
    }
}
