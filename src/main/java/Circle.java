
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jared
 */
public class Circle {

    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = this.PI * this.radius * this.radius;
        return area;
    }

    public double getDiameter() {
        double diameter = this.radius * 2;
        return diameter;
    }

    public double getCircumference() {
        double circumference = this.radius * this.PI * 2;
        return circumference;
    }
}
