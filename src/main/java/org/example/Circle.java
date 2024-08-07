package org.example;
 class Circle extends Ellipse{
    public Circle(double radius) {
        super(radius, radius); // Both axes are equal for a circle
    }

    @Override
    public double getMajorAxis() {
        return super.getMajorAxis();
    }

    @Override
    public void setMajorAxis(double majorAxis) {
        super.setMajorAxis(majorAxis);
        super.setMinorAxis(majorAxis); // Minor axis is equal to major axis
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    public double getRadius() {
        return getMajorAxis(); // Radius is the same as major axis
    }

    public void setRadius(double radius) {
        setMajorAxis(radius);
    }
}
