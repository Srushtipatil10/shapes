package org.example;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    @Override
    double area() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    double perimeter() {
        // Approximate formula for the circumference of an ellipse
        double a = majorAxis;
        double b = minorAxis;
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if (majorAxis > 0) {
            this.majorAxis = majorAxis;
        } else {
            throw new IllegalArgumentException("Major axis must be positive.");
        }
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if (minorAxis > 0) {
            this.minorAxis = minorAxis;
        } else {
            throw new IllegalArgumentException("Minor axis must be positive.");
        }
    }
}
