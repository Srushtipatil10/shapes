package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        try {
            System.out.println("Choose a shape (circle, square, rectangle, ellipse):");
            String shapeType = scanner.nextLine().toLowerCase();

            switch (shapeType) {
                case "circle":
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case "square":
                    System.out.print("Enter side length: ");
                    double sideLength = scanner.nextDouble();
                    shape = new Square(sideLength);
                    break;
                case "rectangle":
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case "ellipse":
                    System.out.print("Enter major axis: ");
                    double majorAxis = scanner.nextDouble();
                    System.out.print("Enter minor axis: ");
                    double minorAxis = scanner.nextDouble();
                    shape = new Ellipse(majorAxis, minorAxis);
                    break;
                default:
                    System.out.println("Invalid shape type.");
                    return;
            }
            DecimalFormat df = new DecimalFormat("#.00");
            String formattedValue = df.format(shape.area());
            String formattedPerimeterValue = df.format(shape.perimeter());

            // Displaying the results
            System.out.println("Area: " + formattedValue);
            System.out.println("Perimeter: " + formattedPerimeterValue);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}