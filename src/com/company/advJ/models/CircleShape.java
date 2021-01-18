package com.company.advJ.models;

public class CircleShape  extends Shape implements ShapeOperations{

    private double radius;

    public CircleShape() {
        super();
        radius = 1.0;
    }

    public CircleShape(double radius) {
        this.radius = radius;
    }

    public CircleShape(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with" +
                "radius="+radius+", which is a subclass of "+ super.toString();
    }

}
