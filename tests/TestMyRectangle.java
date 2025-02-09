//      QAP2 - Java
// Author: Noah Whiffen - SD12
// Dates: February 8th, 2025 -February 9th, 2025

package tests;

import classes.MyRectangle;
import classes.MyPoint;

public class TestMyRectangle {
    
    public static void main(String[] args) {

        // Declare points
        MyPoint a = new MyPoint(5,4);
        MyPoint c = new MyPoint(9, 9);

        // Declare rectangle
        MyRectangle rectangle = new MyRectangle(a, c);

        // Test getters
        System.out.println("Getter Methods");
        System.out.println("----------------------------------------");
        System.out.println("Get point a: " + rectangle.getA());
        System.out.println("Get point b: " + rectangle.getB());
        System.out.println("Get point c: " + rectangle.getC());
        System.out.println("Get point d: " + rectangle.getD());
        System.out.println("Get length: " + rectangle.getLength());
        System.out.println("Get width: " + rectangle.getWidth());
        System.out.println("Get perimeter: " + rectangle.getPerimeter());
        System.out.println("Get area: " + rectangle.getArea());
        System.out.println("----------------------------------------");

        // Test setters
        System.out.println("Setter Methods");
        System.out.println("----------------------------------------");
        
        rectangle.setA(new MyPoint(10, 11));
        rectangle.setC(new MyPoint(6, 11));

        System.out.println("New point a: " + rectangle.getA());
        System.out.println("New point c: " + rectangle.getC());
        System.out.println("----------------------------------------");

        // Test to string
        System.out.println("To string method");
        System.out.println("----------------------------------------");
        System.out.println(rectangle.toString());
        System.out.println("----------------------------------------");
    }
}
