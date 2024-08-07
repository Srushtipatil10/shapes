package org.example;

public class Square extends Rectangle{
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double sideLength) {
        super.setLength(sideLength);
        super.setWidth(sideLength); // Ensure width is the same as length
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double sideLength) {
        super.setWidth(sideLength);
        super.setLength(sideLength); // Ensure length is the same as width
    }
}

