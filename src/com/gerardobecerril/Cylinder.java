package com.gerardobecerril;

public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }

    public double getBaseArea() {
        return super.getArea();
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * this.getRadius() * height) + (2 * this.getBaseArea());
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() +
                ", height='" + height;
    }
}
