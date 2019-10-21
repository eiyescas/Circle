/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author 17862
 */
public class Circle {

    // the private data members
    private double radius;
    private double area;
    private double circumfrence;

    public Circle() {
        radius = 1.0;

    }

    public Circle(double r) {
        radius = r;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    public double getArea() {
        return ((radius * radius) * Math.PI);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle c = new Circle(s.nextDouble());
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());

    }

}
